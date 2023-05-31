/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */

public class Payment {
    // Data Fields
    private int paymentId;
    private String paymentDesc;
    private double paymentAmount;
    
    // Constructor
    public Payment(){}
    
    public Payment(int paymentId, String paymentDesc, double paymentAmount){
        this.paymentId = paymentId;
        this.paymentDesc = paymentDesc;
        this.paymentAmount = paymentAmount;
    }

    // Getters & Setters
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    // toString() method
    @Override
    public String toString() {
        return "\t\t\tPayment ID: " + paymentId + "\n\t\t\tPayment Description: " + 
                paymentDesc + "\n\t\t\tPayment Amount :" + paymentAmount;
    }
    
}
