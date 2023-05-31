/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */

import java.text.ParseException;
import java.util.Date;
public class Employee extends Account{
    // Data Fields
    private int empId;
    private String empDesc;
    private Boolean onLeave;
    
    // Constructor "doesn't exist in UML"
    public Employee(){}
    
    public Employee(int empId, String empDesc, Boolean onLeave, int id, String name,
            String email, Date dateOfBirth, char gender, 
            int phone, String address) throws ParseException{
        super(id, name, email, dateOfBirth, gender, phone, address);
        this.empId = empId;
        this.empDesc = empDesc;
        this.onLeave = onLeave;
    }

    // Getters & Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpDesc() {
        return empDesc;
    }

    public void setEmpDesc(String empDesc) {
        this.empDesc = empDesc;
    }

    public Boolean isOnLeave() {
        return onLeave;
    }

    public void setOnLeave(Boolean onLeave) {
        this.onLeave = onLeave;
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + "\n\n\t\t\tEmployee ID: " + empId + 
                "\n\t\t\tEmployee Description: " + empDesc + "\n\t\t\tOn Leave : " + onLeave;
    }
        
}
