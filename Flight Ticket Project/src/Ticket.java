public class Ticket {

    private String passengerName;
    private String flightDate;


    public Ticket(String passengerName, String flightDate) {
        this.passengerName = passengerName;
        this.flightDate = flightDate;
    }

    // Getters
    public String getPassengerName() { 
        return passengerName; 
    }
    
    public String getFlightDate() { 
        return flightDate; 
    }

    //Setter
    public void setPassengerName(String passengerName) { 
        this.passengerName = passengerName; 
    }

    public void setFlightDate(String flightDate) { 
        this.flightDate = flightDate; 
    }
}
