public class FlightManager {
    private Flight[] flights;
    private int numberOfFlights;

    public FlightManager(int size) {

        flights = new Flight[size];
        numberOfFlights = 0;
    }

    public void addFlight(String flightNumber, String date, int seats) {

        if (numberOfFlights < flights.length) {
            flights[numberOfFlights++] = new Flight(flightNumber, date, seats);
        }
    }

    public void searchFlightsByDate(String date) {

        for (int i = 0; i < numberOfFlights; i++) {
            if (flights[i].getDate().equals(date)) {
                System.out.println("Flight Number: " + flights[i].getFlightNumber() + ", Seats Available: " + flights[i].getSeatsAvailable());
            }
        }
    }

    // Add methods to manage flights and bookings
}
