/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;

/**
 *
 * @author Sagun
 */
public class Teacher implements Serializable{
    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String Phone) {
        this.phone = Phone;
    }
    
        
    
}
