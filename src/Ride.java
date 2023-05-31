/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */

public class Ride {
    // Data Fields
    private int rideID;
    private String rideType;
    private int noOfSeats;
    private String registrationNo;

    // Constructor
    public Ride(int rideID, String rideType, int noOfSeats, String registrationNo) {
        this.rideID = rideID;
        this.rideType = rideType;
        this.noOfSeats = noOfSeats;
        this.registrationNo = registrationNo;
    }

    // Getters & Setters
    public int getRideID() {
        return rideID;
    }

    public void setRideID(int rideID) {
        this.rideID = rideID;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    // toString() method
    @Override
    public String toString() {
        return "\t\t\tRide ID: " + rideID + "\n\t\t\tRide Type: " + rideType + 
                "\n\t\t\tNumber of Seats: " + noOfSeats + "\n\t\t\tRegistration No.: " 
                + registrationNo;
    }

}
