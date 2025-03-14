package customer;

import libraryItem.LibraryItem;

import java.util.ArrayList;

public class Customer {
    protected String firstName ;
    protected String lastName ;
    protected String phoneNumber ;

    protected ArrayList<LibraryItem> borrowItem ;
    protected ArrayList<LibraryItem> BuyItem ;


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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
