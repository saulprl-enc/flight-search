import { useQuery } from "react-query";
import { useSearchParams } from "react-router-dom";

export const Flights = () => {
  const [searchParams] = useSearchParams();

  const departureAirport = searchParams.get("departureAirport");
  const arrivalAirport = searchParams.get("arrivalAirport");
  const departureDate = searchParams.get("departureDate");
  const returnDate = searchParams.get("returnDate");
  const currency = searchParams.get("currency");

  const flight = useQuery({
    queryKey: [
      "flights",
      { departureAirport, arrivalAirport, departureDate, returnDate, currency },
    ],
    queryFn: async () => {
      const params = new URLSearchParams();
      params.set("origin", departureAirport!);
      params.set("destination", arrivalAirport!);
      params.set("departureDate", departureDate!);
      if (returnDate) {
        params.set("returnDate", returnDate);
      }

      params.set("currencyCode", currency!);

      const apiUrl = `${
        import.meta.env.VITE_APP_API_URL
      }/flights?${params.toString()}`;

      const res = await fetch(apiUrl);

      console.log(await res.json());
    },
  });

  return (
    <main className="w-screen h-screen justify-center items-center flex flex-col"></main>
  );
};
