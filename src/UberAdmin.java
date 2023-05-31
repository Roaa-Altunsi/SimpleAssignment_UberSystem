/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */

import java.text.ParseException;
import java.util.Date;
public class UberAdmin extends Employee{
    
    // Data Fields
    private String department;
    
    // Constructor "doesn't exist in UML"
    public UberAdmin(){}
    
    public UberAdmin(String department, int empId, 
            String empDesc, Boolean onLeave, int id, String name, String email, 
            Date dateOfBirth, char gender, int phone, String address) throws ParseException{
        super(empId, empDesc, onLeave, id, name, email, dateOfBirth, gender, phone, address);
        this.department = department;
    }

    // Getters & Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + "\n\t\t\tDepartment: " + department;
    }

}
