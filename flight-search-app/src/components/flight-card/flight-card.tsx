import { Airline, APIResponse, FlightOffer } from "@/models/api-response";
import { format } from "date-fns";
import { FC } from "react";
import { useQuery } from "react-query";
import * as durationFns from "duration-fns";

interface Props {
  flight: FlightOffer;
}

export const FlightCard: FC<Props> = ({ flight }) => {
  const startingTime = flight.itineraries[0]?.segments[0].departure.at;
  const endingTime =
    flight.itineraries[flight.itineraries.length - 1]?.segments.at(-1)?.arrival
      .at;

  const departureAirport = flight.itineraries.at(0)?.segments.at(0)
    ?.departure.iataCode;
  const arrivalAirport = flight.itineraries.at(0)?.segments.at(0)
    ?.arrival.iataCode;

  const carrierCode = flight.itineraries.at(0)?.segments.at(0)?.carrierCode;

  const currencyFormatter = Intl.NumberFormat("en-US", {
    currency: flight.price.currency,
    style: "currency",
  });

  const grandTotal = flight.price.grandTotal;
  const travelerPrice = flight.travelerPricings.at(0)?.price.total;

  return (
    <div className="flex p-2 rounded border-2 border-border gap-2 justify-between">
      <div className="flex h-full flex-col gap-2">
        <span>{`${format(startingTime, "p")} - ${format(
          endingTime ?? "",
          "p"
        )}`}</span>
        <span>{`${departureAirport} - ${arrivalAirport}`}</span>
        <AirlineInfo carrierCode={carrierCode ?? ""} />
      </div>
      <div className="flex flex-col h-full gap-2">
        <FlightDuration duration={flight.itineraries.at(0)?.duration ?? ""} />
      </div>
      <div className="h-full gap-2 flex flex-col items-end">
        <span className="font-bold">{`${currencyFormatter.format(
          Number(grandTotal)
        )} total`}</span>
        <span>{`${currencyFormatter.format(
          Number(travelerPrice)
        )} per traveler`}</span>
      </div>
    </div>
  );
};

interface AirlineProps {
  carrierCode: string;
}

const AirlineInfo: FC<AirlineProps> = ({ carrierCode }) => {
  const { status, data } = useQuery({
    queryKey: ["airline", carrierCode],
    queryFn: async () => {
      const apiUrl = `${
        import.meta.env.VITE_APP_API_URL
      }/airlines?airlineCode=${carrierCode}`;

      const res = await fetch(apiUrl);

      const data = (await res.json()) as APIResponse<Airline>;

      return data;
    },
  });

  return (
    <span>
      {status === "success"
        ? `${data.data.at(0)?.commonName} (${data.data.at(0)?.iataCode})`
        : "No airline data found"}
    </span>
  );
};

interface DurationProps {
  duration: string;
}

const FlightDuration: FC<DurationProps> = ({ duration }) => {
  const parsedDuration = durationFns.parse(duration);

  return <span>{`${parsedDuration.hours}h ${parsedDuration.minutes}m`}</span>;
};
