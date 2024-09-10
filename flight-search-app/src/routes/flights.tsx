import { FlightCard } from "@/components/flight-card/flight-card";
import { NavigateButton } from "@/components/navigate-button/navigate-button";
import { APIResponse, FlightOffer } from "@/models/api-response";
import { useQuery } from "react-query";
import { useNavigate, useSearchParams } from "react-router-dom";

export const Flights = () => {
  const [searchParams] = useSearchParams();

  const departureAirport = searchParams.get("departureAirport");
  const arrivalAirport = searchParams.get("arrivalAirport");
  const departureDate = searchParams.get("departureDate");
  const returnDate = searchParams.get("returnDate");
  const currency = searchParams.get("currency");
  const adults = searchParams.get("adults");

  const { status, data, error } = useQuery({
    queryKey: [
      "flights",
      {
        departureAirport,
        arrivalAirport,
        departureDate,
        returnDate,
        currency,
        adults,
      },
    ],
    queryFn: async () => {
      const params = new URLSearchParams();
      params.set("origin", departureAirport!);
      params.set("destination", arrivalAirport!);
      params.set("departureDate", departureDate!);
      params.set("adults", adults ?? "1");
      if (returnDate) {
        params.set("returnDate", returnDate);
      }

      params.set("currencyCode", currency!);

      const apiUrl = `${
        import.meta.env.VITE_APP_API_URL
      }/flights?${params.toString()}`;

      const res = await fetch(apiUrl);

      const data = (await res.json()) as APIResponse<FlightOffer>;

      console.log(data);

      return data;
    },
  });

  return (
    <main className="w-screen h-screen justify-center items-center relative flex flex-col">
      <NavigateButton to="/">Home</NavigateButton>
      {status === "success" ? (
        data.data?.length === 0 ? (
          <div className="flex flex-col items-center justify-center gap-2">
            <span>No flights found</span>
            <NavigateButton to="/">Home</NavigateButton>
          </div>
        ) : (
          <div className="flex flex-col w-2/3 gap-2">
            {data.data.map((flight) => (
              <FlightCard key={flight.id} flight={flight} />
            ))}
          </div>
        )
      ) : status === "loading" ? (
        <span>Loading...</span>
      ) : (
        <span>Something went wrong while fetching your flights</span>
      )}
    </main>
  );
};
