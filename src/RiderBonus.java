/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */

public class RiderBonus {
    // Data Fields
    private int bonusId;
    private String bonusDesc;
    private double bonusCredit;

    // Constructor
    public RiderBonus(){}
    
    public RiderBonus(int bonusId, String bonusDesc, double bonusCredit) {
        this.bonusId = bonusId;
        this.bonusDesc = bonusDesc;
        this.bonusCredit = bonusCredit;
    }

    // Getters & Setters
    public int getBonusId() {
        return bonusId;
    }

    public void setBonusId(int bonusId) {
        this.bonusId = bonusId;
    }

    public String getBonusDesc() {
        return bonusDesc;
    }

    public void setBonusDesc(String bonusDesc) {
        this.bonusDesc = bonusDesc;
    }

    public double getBonusCredit() {
        return bonusCredit;
    }

    public void setBonusCredit(double bonusCredit) {
        this.bonusCredit = bonusCredit;
    }

    // toString() method
    @Override
    public String toString() {
        return "\t\t\tBonusID: " + bonusId + "\n\t\t\tBonus Description: " + bonusDesc +
                "\n\t\t\tbonus Kilometer(s) :" + bonusCredit;
        
    }

}
