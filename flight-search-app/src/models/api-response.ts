export interface CollectionLinks {
  self?: string | null;
  first: string | null;
  last: string | null;
  next: string | null;
  previous: string | null;
  up: string | null;
}

export interface APIResponse<T> {
  meta?: {
    count: number;
    links?: CollectionLinks;
  };
  data: Array<T>;
}

export interface Location {
  id: string;
  type: string;
  subType: string;
  name?: string;
  detailedName?: string;
  timeZoneOffset: string;
  iataCode?: string;
  geoCode: {
    latitude: number;
    longitude: number;
  };
  address: {
    cityName: string;
    cityCode: string;
    countryName: string;
    countryCode: string;
    stateCode: string;
    regionCode: string;
  };
  distance: {
    value: number;
    unit: string;
  };
  category: string;
  relevance: number;
  rank: string;
}

export interface Airline {
  type: string;
  iataCode: string;
  icaoCode: string;
  businessName: string;
  commonName: string;
}

export interface FlightOffer {
  id: string;
  oneWay: boolean;
  lastTicketingDate: string;
  lastTicketingDateTime: string;
  itineraries: Array<Itinerary>;
}

export interface Itinerary {
  duration: string;
  segments: Array<Segment>;
}

export interface Segment {
  id: string;
  numberOfStops: number;
  departure: FlightEndPoint;
  arrival: FlightEndPoint;
  carrierCode: string;
  duration: string;
  stops: Array<FlightStop>;
}

export interface FlightEndPoint {
  iataCode: string;
  terminal: string;
  at: string;
}

export interface FlightStop {
  iataCode: string;
  duration: string;
  arrivalAt: string;
  departureAt: string;
}
