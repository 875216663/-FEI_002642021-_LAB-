/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author caofei
 */
public class Address {
    String street;
    String aptNo;
    String city;
    String zipCode;
    public Address(){
    this.street="";
    this.aptNo="";
    this.city="";
    this.zipCode="";
}
    
    

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    
}
