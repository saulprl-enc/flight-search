# Breakable Toy 2 - Flight Search

This is the repo for my Breakable Toy 2 project. The project is meant to be run using Docker, but for now it'll only be able to run traditionally.

## Running the project

1. Clone this repository

Before doing anything else, you must clone this repository, which can be done by running the following command:

```bash
git clone git@github.com:saulprl-enc/flight-search.git
```

2. Installing dependencies.

The front-end app needs its dependencies to be installed before attempting to run any scripts. First, navigate to the front-end project using `cd flight-search-app` and then running:

```bash
npm install
```

As a side note, this project was created using `Node.js v20.15.1`.

3. Environment variables.

The front-end project needs an environment variable to connect to the back-end. You must create a file named `.env.local` with the following contents:

```bash
VITE_APP_API_URL=http://localhost:8080 # or the back-end's IP and port
```

4. Running the project.

**Recommendation: prepare at least to terminals in order to execute each project separately**. Otherwise, you can run one project, send it to the background (with `Ctrl + Z`), and execute the other one.

- Back-end.

First, navigate to the back-end's directory and then run the following commands:

```bash
cd backend
./gradlew :build
./gradlew :bootRun
```

This will install the necessary dependencies, compile the code, and ultimately run the project on port `8080`.

- Front-end.

First, navigate to the front-end's directory and then run `npm start` or `npm run start`:

```bash
cd flight-search-app
npm run start # or npm start
```

The command line will notify you when the project's up and running on port `5173`, and will give you the URL.
