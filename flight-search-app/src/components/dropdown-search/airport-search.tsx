import { FC, ReactNode, useRef } from "react";
import { Button } from "../ui/button";
import { Input } from "../ui/input";
import { Popover, PopoverContent, PopoverTrigger } from "../ui/popover";

import { useMutation } from "react-query";
import { APIResponse, Location } from "@/models/api-response";
import { ScrollArea } from "../ui/scroll-area";

interface Props {
  value?: string;
  onChange: (value: string) => void;
}

export const AirportSearch: FC<Props> = ({ value, onChange }) => {
  const inputRef = useRef<HTMLInputElement>(null);

  const mutation = useMutation(async () => {
    const apiUrl = `${import.meta.env.VITE_APP_API_URL}/airports?keyword=${
      inputRef.current?.value
    }`;
    const res = await fetch(apiUrl);

    const data = await res.json();

    return data as APIResponse<Location>;
  });

  const searchAirports = () => {
    mutation.mutate();
  };

  const handleOpenPopover = () => {
    if (inputRef.current) {
      inputRef.current.value = "";
    }
  };

  return (
    <Popover onOpenChange={handleOpenPopover}>
      <PopoverTrigger asChild>
        <Button variant="outline" className="w-full justify-start">
          {value || "Select airport..."}
        </Button>
      </PopoverTrigger>
      <PopoverContent className="w-80 gap-2 flex flex-col">
        <div className="grid gap-4">
          <div className="space-y-2">
            <h4 className="font-medium leading-none">Search term</h4>
          </div>
          <div className="grid gap-2">
            <div className="grid grid-cols-3 items-center gap-4">
              <Input
                ref={inputRef}
                id="width"
                placeholder="LAX"
                className="col-span-2 h-8"
              />
              <Button onClick={searchAirports}>Search</Button>
            </div>
          </div>
        </div>
        <ScrollArea className="h-32">
          {mutation.data
            ? mutation.data.data.map((location) => (
                <PopoverItem
                  key={location.id}
                  value={location.iataCode!}
                  onClick={onChange}
                >{`${location.iataCode} - ${location.name}`}</PopoverItem>
              ))
            : null}
        </ScrollArea>
      </PopoverContent>
    </Popover>
  );
};

interface ItemProps {
  children: ReactNode;
  value: string;
  onClick: (value: string) => void;
}

const PopoverItem: FC<ItemProps> = ({ children, value, onClick }) => {
  const handleClick = () => {
    onClick(value);
  };

  return (
    <Button
      variant="ghost"
      onClick={handleClick}
      className="w-full justify-start"
    >
      {children}
    </Button>
  );
};
