package admin;

import customer.BorrowingPrivilege;
import customer.BuyPrivilege;
import customer.Customer;

import java.util.ArrayList;

public class Admin {

    public ArrayList<Customer> customers = new ArrayList<>();


    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer  "  + customer.getFirstName() + " added  Successfully");
    }

    public void deleteCustomer(Customer customer) {
        if (customers.remove(customer)) {
            System.out.println("Customer  " + customer.getFirstName()+ " removed Successfully");
        } else
            System.out.println("Not Found");
    }

    public ArrayList<Customer> getCustomers (){
        return customers ;
    }

}
