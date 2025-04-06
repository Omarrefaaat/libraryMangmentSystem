import Util.Printer;
import admin.Admin;
import customer.BuyPrivilege;
import customer.Customer;
import customer.GuestCustomer;
import customer.PremiumCustomer;

import java.util.ArrayList;

public class LibraryManagementSystemApp {

    Admin admin = new Admin();


    public void run() {

        GuestCustomer customer1 = new GuestCustomer("Ahmed", "Mohamed", "011");
        GuestCustomer customer2 = new GuestCustomer("Nael", "Mohamed", "010");
        admin.addCustomer(customer1 , customer2 , customer1 , customer2);

        Printer.printCustomerList(admin.getCustomers());
        admin.deleteCustomer(customer2);
        Printer.printCustomerList(admin.getCustomers());

    }
}

