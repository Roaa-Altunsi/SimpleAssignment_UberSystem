/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */

import java.text.ParseException;
import java.util.Date;
public class Captain extends Employee{
    
    // Data Fields
    private int drivingLicenseNo;
    private int totalRides;
    private double rating;
    
    // Constructor "doesn't exist in UML"
    public Captain(){}
    
    public Captain(int drivingLicenseNo, int totalRides, double rating,int empId, 
            String empDesc, Boolean onLeave, int id, String name, String email, 
            Date dateOfBirth, char gender, int phone, String address) throws ParseException{
        super(empId, empDesc, onLeave, id, name, email, dateOfBirth, gender, phone, address);
        this.drivingLicenseNo = drivingLicenseNo;
        this.totalRides = totalRides;
        this.rating = rating;
    }

    // Getters & Setters
    public int getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(int drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public void setTotalRides(int totalRides) {
        this.totalRides = totalRides;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + "\n\t\t\tDriving License No: " + drivingLicenseNo +
                "\n\t\t\tTotal Rides: " + totalRides + "\n\t\t\tRating :" + rating;
    }
    
}
