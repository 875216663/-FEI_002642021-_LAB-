/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author caofei
 */
public class Person {
    private String nuid;
    private String firstName;
    private String lastName;
    private String collegeName;
    
    Address address;
    Address permanentAddress;
    Contact personContact;
    Contact officeContact;
    
    public Person(){
        this.nuid="";
        this.firstName="";
        this.lastName="";
        this.collegeName="";
        
        this.address=new Address();
        this.permanentAddress=new Address();
        
        this.personContact=new Contact();
        this.officeContact=new Contact();
    }

    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        this.nuid = nuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Contact getPersonContact() {
        return personContact;
    }

    public void setPersonContact(Contact personContact) {
        this.personContact = personContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }

    

    
    
}
