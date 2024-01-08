import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightManager manager = new FlightManager(10); // Assume max 10 flights in a week

        // Dummy data
        manager.addFlight("FL100", "2023-11-19", 100);
        manager.addFlight("FL101", "2023-11-20", 100);
        // Add more flights as needed

        System.out.println("Enter a date to search for flights (YYYY-MM-DD):");
        String date = scanner.nextLine();

        System.out.println("Available flights on " + date + ":");
        manager.searchFlightsByDate(date);
    }
}