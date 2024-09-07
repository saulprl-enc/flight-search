import { z } from "zod";

export const CurrencyCode = z.enum(["USD", "MXN", "EUR"]);

export type CurrencyCode = z.infer<typeof CurrencyCode>;
