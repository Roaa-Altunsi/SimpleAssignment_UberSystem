/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
public class Rider extends Account{
    
    // Data Fields
    private double walletBalance;
    private String pickupForm;
    private String dropTo;
    private double distance;
    private Captain captain;
    private UberAdmin uberAdmin;
    private Payment[] payment;
    private RiderBonus[] riderBonus;
    private Ride ride;
    private Date joinDate;
    private double rating;
    
    // Constructor "doesn't exist in UML"
    public Rider(){}

    public Rider(double walletBalance, String pickupForm, String dropTo,
            double distance, Date joinDate, double rating, int id, 
            String name, String email, Date dateOfBirth, char gender, 
            int phone, String address, int nosOfPayment, int nosOfBonus) throws ParseException {
        
        super(id, name, email, dateOfBirth, gender, phone, address);
        this.walletBalance = walletBalance;
        this.pickupForm = pickupForm;
        this.dropTo = dropTo;
        this.distance = distance;
        this.joinDate = joinDate;
        this.rating = rating;
        payment = new Payment[nosOfPayment];
        riderBonus = new RiderBonus[nosOfBonus];
    }
    
    // Getters & Setters
    public double getTotalBonus(){ 
        double total = 0;
        for (RiderBonus riderBonu : riderBonus) 
            total += riderBonu.getBonusCredit();
        
        return total;
    }
    
    public double getTtoalPayement(){ 
        double total = 0;
        for (Payment pay : payment) 
            total += pay.getPaymentAmount();
        
        return total;
    }
    
    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public String getPickupForm() {
        return pickupForm;
    }

    public void setPickupForm(String pickupForm) {
        this.pickupForm = pickupForm;
    }

    public String getDropTo() {
        return dropTo;
    }

    public void setDropTo(String dropTo) {
        this.dropTo = dropTo;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public UberAdmin getUberAdmin() {
        return uberAdmin;
    }

    public void setUberAdmin(UberAdmin uberAdmin) {
        this.uberAdmin = uberAdmin;
    }

    public Payment[] getPayment() { 
        return payment;
    }
    
    public void setPayment(Payment[] payment) {
        payment = this.payment;
    }
    
    public void setPayment(Payment payment, int index) {
        this.payment[index] = payment;
    }

    public RiderBonus[] getRiderBonus() { 
        return riderBonus;
    }
    
    public void setRiderBonus(RiderBonus[] riderbonus){
        riderBonus = riderbonus;
    }
    
    public void setRiderBonus(RiderBonus riderBonus, int index){
        this.riderBonus[index] = riderBonus;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    // Service Mwthods
    public double calNetPayment(){    
        return getTtoalPayement() - getTotalBonus();
    }
    
    public String printRiderBasicInfo(){
        return super.toString() + 
                "\n-------------------------------------------------------------------------------------------"
                + "\n\n\t\t\tWallet Balance: " + walletBalance + " SAR,\n\n\t\t\tPickup Location: " +
                pickupForm + ",\n\n\t\t\tDrop Location: " + dropTo + ",\n\n\t\t\tDistance: " + distance +
                " KM,\n\n\t\t\tJoining Date: " + joinDate + ",\n\n\t\t\tRider Rating: " + rating +
                "\n-------------------------------------------------------------------------------------------";
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + 
                "\n\n\t\t\tWallet Balance: " + walletBalance + " SAR,\n\n\t\t\tPickup Location: " +
                pickupForm + ",\n\n\t\t\tDrop Location: " + dropTo + ",\n\n\t\t\tDistance: " + distance +
                " KM,\n\n\t\t\tCaptain: \n" + captain.toString() + "\n\n\t\t\tUberAdmin: \n" + uberAdmin.toString() + 
                "\n\n\t\t\tPayment: \n" + Arrays.toString(payment) + "\n\n\t\t\tRiderBonus: \n" + Arrays.toString(riderBonus) 
                + "\n\n\t\t\tRide: \n" + ride + "\n\n\t\t\tJoining Date: " + joinDate + ",\n\n\t\t\tRider Rating: " + rating;
    }
    
}
