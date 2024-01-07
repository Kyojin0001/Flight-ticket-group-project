import java.util.Scanner;

public class FlightManager {
    private Flight[] flights;
    private Queue waitingList;

    public FlightManager(int numberOfFlights, int queueCapacity) {
        flights = new Flight[numberOfFlights];
        waitingList = new Queue(queueCapacity);
        // Initialize flights with dummy data
        for (int i = 0; i < numberOfFlights; i++) {
            flights[i] = new Flight("2024-01-" + (i + 1), 5); // Example: 5 tickets per flight
        }
    }

    // Add methods to manage flights and bookings
}
