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
  price: Price;
  travelerPricings: Array<TravelerPricing>;
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

export interface Price {
  grandTotal: string;
  billingCurrency: string;
  currency: string;
  total: string;
  base: string;
  fees: Array<Fee>;
  taxes: Array<Tax>;
}

export interface Fee {
  amount: string;
  type: string;
}

export interface Tax {
  amount: string;
  code: string;
}

export interface TravelerPricing {
  travelerId: string;
  price: Price;
  fareOption: string;
  travelerType: string;
}
