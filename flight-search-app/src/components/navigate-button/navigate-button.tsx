import { FC, ReactNode } from "react";
import { Button } from "../ui/button";
import { useNavigate } from "react-router-dom";
import { cn } from "@/lib/utils";

interface Props {
  to: string;
  children: ReactNode;
  className?: string;
}

export const NavigateButton: FC<Props> = ({ to, children, className }) => {
  const navigate = useNavigate();

  return (
    <Button
      onClick={() => navigate(to)}
      className={cn("fixed top-2 left-2", className)}
    >
      {children}
    </Button>
  );
};
