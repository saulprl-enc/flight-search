import { useForm } from "react-hook-form";
import { AirportSearch } from "../dropdown-search/airport-search";
import {
  Form,
  FormControl,
  FormField,
  FormItem,
  FormLabel,
  FormMessage,
} from "../ui/form";
import { Button } from "../ui/button";
import { DatePicker } from "../date-picker/date-picker";
import { CurrencyPicker } from "../currency-picker/currency-picker";
import { CurrencyCode } from "@/models/currency";
import { z } from "zod";
import { zodResolver } from "@hookform/resolvers/zod";
import { useNavigate, useSearchParams } from "react-router-dom";
import { format } from "date-fns";
import { Checkbox } from "../ui/checkbox";

const AirportSearchForm = z.object({
  departureAirport: z.string(),
  arrivalAirport: z.string(),
  departureDate: z.date(),
  returnDate: z.date().optional(),
  currency: CurrencyCode,
  nonStop: z.boolean().default(false).optional(),
});

type AirportSearchForm = z.infer<typeof AirportSearchForm>;

export const FlightForm = () => {
  const navigate = useNavigate();

  const form = useForm<AirportSearchForm>({
    resolver: zodResolver(AirportSearchForm),
  });

  const handleFormSubmit = (data: AirportSearchForm) => {
    const params = new URLSearchParams();
    params.set("departureAirport", data.departureAirport);
    params.set("arrivalAirport", data.arrivalAirport);
    params.set("departureDate", format(data.departureDate, "yyyy-MM-dd"));
    if (data.returnDate) {
      params.set("returnDate", format(data.returnDate, "yyyy-MM-dd"));
    }

    params.set("currency", data.currency);
    params.set("nonStop", data.nonStop ? "true" : "false");

    navigate(`/flights?${params.toString()}`);
  };

  return (
    <div className="p-2 border-2 border-border">
      <Form {...form}>
        <form
          onSubmit={form.handleSubmit(handleFormSubmit)}
          className="flex flex-col gap-2"
        >
          <FormField
            name="departureAirport"
            control={form.control}
            render={({ field }) => (
              <FormItem className="grid grid-cols-2">
                <FormLabel className="justify-self-end">
                  Departure Airport
                </FormLabel>
                <FormControl>
                  <AirportSearch
                    value={field.value}
                    onChange={field.onChange}
                  />
                </FormControl>
                <div></div>
                <FormMessage />
              </FormItem>
            )}
          />
          <FormField
            name="arrivalAirport"
            control={form.control}
            render={({ field }) => (
              <FormItem className="grid grid-cols-2">
                <FormLabel className="justify-self-end">
                  Arrival Airport
                </FormLabel>
                <FormControl>
                  <AirportSearch
                    value={field.value}
                    onChange={field.onChange}
                  />
                </FormControl>
                <div></div>
                <FormMessage />
              </FormItem>
            )}
          />
          <FormField
            name="departureDate"
            control={form.control}
            render={({ field }) => (
              <FormItem className="grid grid-cols-2">
                <FormLabel className="justify-self-end">
                  Departure Date
                </FormLabel>
                <FormControl>
                  <DatePicker value={field.value} onChange={field.onChange} />
                </FormControl>
                <div></div>
                <FormMessage />
              </FormItem>
            )}
          />
          <FormField
            name="returnDate"
            control={form.control}
            render={({ field }) => (
              <FormItem className="grid grid-cols-2">
                <FormLabel className="justify-self-end">Return Date</FormLabel>
                <FormControl>
                  <DatePicker value={field.value} onChange={field.onChange} />
                </FormControl>
                <div></div>
                <FormMessage />
              </FormItem>
            )}
          />
          <FormField
            control={form.control}
            name="currency"
            render={({ field }) => (
              <FormItem className="grid grid-cols-2">
                <FormLabel className="justify-self-end">Currency</FormLabel>
                <FormControl>
                  <CurrencyPicker
                    value={field.value}
                    onChange={field.onChange}
                  />
                </FormControl>
                <div></div>
                <FormMessage />
              </FormItem>
            )}
          />
          <FormField
            control={form.control}
            name="nonStop"
            render={({ field }) => (
              <FormItem className="grid grid-cols-2">
                <FormLabel className="justify-self-end">Non-stop</FormLabel>
                <FormControl>
                  <Checkbox checked={field.value} onChange={field.onChange} />
                </FormControl>
              </FormItem>
            )}
          />
          <Button>Submit</Button>
        </form>
      </Form>
    </div>
  );
};
