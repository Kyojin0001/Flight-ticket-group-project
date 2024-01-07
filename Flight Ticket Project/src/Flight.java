public class Flight {
    
    private String flightDate;
    private int ticketsAvailable;

    public Flight(String flightDate, int ticketsAvailable) {
        this.flightDate = flightDate;
        this.ticketsAvailable = ticketsAvailable;
    }

    // Getters and Setters
    public String getFlightDate() { return flightDate; }
    public int getTicketsAvailable() { return ticketsAvailable; }
    public void setTicketsAvailable(int tickets) { this.ticketsAvailable = tickets; }
}
