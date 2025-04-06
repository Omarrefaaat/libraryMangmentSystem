package admin;

import customer.BorrowingPrivilege;
import customer.BuyPrivilege;
import customer.Customer;
import dataBase.CustomerDataStorage;

import java.util.ArrayList;

public class Admin {

    public ArrayList<Customer> customers = new ArrayList<>();
    CustomerDataStorage customerDataStorage = new CustomerDataStorage();

    public void addCustomer(Customer... customer ) {


        for (Customer item: customer) {
            customers.add(item);
            System.out.println("Customer  "  + item.getFirstName() + " added  Successfully");
        }

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
