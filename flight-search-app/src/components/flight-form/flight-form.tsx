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
import { Input } from "../ui/input";

const AirportSearchForm = z.object({
  departureAirport: z.string({
    required_error: "The departure airport is required.",
  }),
  arrivalAirport: z.string({
    required_error: "The arrival airport is required.",
  }),
  departureDate: z
    .date({ required_error: "The departure date is required." })
    .min(new Date(), { message: "Hey, there, time traveler." }),
  returnDate: z
    .date()
    .min(new Date(), { message: "Hey, there, time traveler." })
    .optional(),
  currency: CurrencyCode,
  adults: z.coerce
    .number({
      required_error: "The number of adults is required.",
    })
    .gte(1, {
      message: "The number of adults must be greater than or equal to 0.",
    })
    .default(1),
  nonStop: z.boolean().default(false).optional(),
});

type AirportSearchForm = z.infer<typeof AirportSearchForm>;

export const FlightForm = () => {
  const navigate = useNavigate();

  const form = useForm<AirportSearchForm>({
    resolver: zodResolver(AirportSearchForm),
    defaultValues: {
      adults: 1,
    },
  });

  const handleFormSubmit = (data: AirportSearchForm) => {
    const params = new URLSearchParams();
    params.set("departureAirport", data.departureAirport);
    params.set("arrivalAirport", data.arrivalAirport);
    params.set("departureDate", format(data.departureDate, "yyyy-MM-dd"));
    params.set("adults", data.adults.toString());
    if (data.returnDate) {
      params.set("returnDate", format(data.returnDate, "yyyy-MM-dd"));
    }

    params.set("currency", data.currency);
    params.set("nonStop", data.nonStop ? "true" : "false");

    navigate(`/flights?${params.toString()}`);
  };

  const minDate = new Date();

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
                  <DatePicker
                    value={field.value}
                    onChange={field.onChange}
                    minDate={minDate}
                  />
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
                  <DatePicker
                    value={field.value}
                    onChange={field.onChange}
                    minDate={form.watch("departureDate") ?? minDate}
                  />
                </FormControl>
                <div></div>
                <FormMessage />
              </FormItem>
            )}
          />
          <FormField
            control={form.control}
            name="adults"
            render={({ field }) => (
              <FormItem className="grid grid-cols-2">
                <FormLabel className="justify-self-end">Adults</FormLabel>
                <FormControl>
                  <Input
                    type="number"
                    value={field.value}
                    onChange={field.onChange}
                    min={1}
                  />
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
