import { FlightForm } from "../components/flight-form/flight-form";

function Home() {
  return (
    <main className="w-screen h-screen justify-center items-center flex flex-col">
      <h1>Flight Search</h1>
      <FlightForm />
    </main>
  );
}

export default Home;
