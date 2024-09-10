import { FC } from "react";
import { Popover, PopoverContent, PopoverTrigger } from "../ui/popover";
import { Button } from "../ui/button";
import { CalendarIcon } from "@radix-ui/react-icons";
import { Calendar } from "../ui/calendar";
import { format } from "date-fns";
import { cn } from "@/lib/utils";
import { SelectSingleEventHandler } from "react-day-picker";

interface Props {
  value?: Date;
  onChange: (value?: Date) => void;
  minDate?: Date;
  maxDate?: Date;
}

export const DatePicker: FC<Props> = ({
  value,
  onChange,
  minDate,
  maxDate,
}) => {
  return (
    <Popover>
      <PopoverTrigger asChild>
        <Button
          variant={"outline"}
          className={cn(
            "w-[280px] justify-start text-left font-normal",
            !value && "text-muted-foreground"
          )}
        >
          <CalendarIcon className="mr-2 h-4 w-4" />
          {value ? format(value, "PPP") : <span>Pick a date</span>}
        </Button>
      </PopoverTrigger>
      <PopoverContent className="w-auto p-0">
        <Calendar
          mode="single"
          selected={value}
          onSelect={onChange}
          initialFocus
          fromDate={minDate}
          toDate={maxDate}
        />
        <div className="p-2">
          <Button
            variant="destructive"
            className="w-full"
            onClick={() => onChange(undefined)}
          >
            Clear
          </Button>
        </div>
      </PopoverContent>
    </Popover>
  );
};
