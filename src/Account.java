/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */

import java.text.ParseException;
import java.util.Date;

public class Account{
    
    // Data Fields
    private int id;
    private String name;
    private String email;
    private Date dateOfBirth;
    private char gender;
    private int phone;
    private String address;
    
    // Constructors "doesn't exist in UML"
    public Account(){}
    
    public Account(int id, String name, String email, Date dateOfBirth,
            char gender, int phone, String address) throws ParseException {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
    
    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
     // toString() method
    @Override
    public String toString() {
        return "\t\t\tID: " + id + "\n\t\t\tName: " + name + "\n\t\t\tEmail :" + email +
                "\n\t\t\tDate of Birth :" + dateOfBirth + "\n\t\t\tGender: " + gender + 
                "\n\t\t\tPhone: " + phone + "\n\t\t\tAddress: " + address;
    }
}
