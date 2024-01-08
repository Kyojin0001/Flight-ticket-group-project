public class Flight {
    
    private String flightNumber;
    private String date;
    private int seatsAvailable;

    public Flight(String flightNumber, String date, int seatsAvailable) {

        this.flightNumber = flightNumber;
        this.date = date;
        this.seatsAvailable = seatsAvailable;
    }

    // Getters and Setters
    public String getFlightNumber() { 
        return flightNumber; 
    }

    public String getDate() { 
        return date; 
    }
    
    public int getSeatsAvailable() { 
        return seatsAvailable; 
    }

    
    
    public void bookSeat() { 
        if (seatsAvailable > 0) seatsAvailable--; 
    }
}
