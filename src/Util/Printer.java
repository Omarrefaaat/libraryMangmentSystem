package Util;

import customer.Customer;
import libraryItem.LibraryItem;

import java.util.ArrayList;
import java.util.Objects;

public class Printer {

    public static void printMsg(String msg) {
        System.out.println(msg);
    }


    public static void printMsg(int msg) {
        System.out.println(msg);
    }

    public static void printMsg(boolean msg) {
        System.out.println(msg);
    }

    public static void printList(ArrayList<Object> items) {
        if (items.get(0) instanceof Customer) {
            Customer c;
            for (Object object : items) {
                c = (Customer) object;
                c.displayDetails();
                printMsg("********************");
            }
        } else if (items.get(0) instanceof LibraryItem) {
            LibraryItem lb;
            for (Object object : items) {
                lb = (LibraryItem) object;
                lb.displayDetails();
                printMsg("********************");
            }


        }
    }

    public static void printLibItemList(ArrayList<LibraryItem> libraryItems) {
        for (LibraryItem item : libraryItems) {
            item.displayDetails();
            printMsg("********************");
        }
    }
    public static void printCustomerList(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            customer.displayDetails();
            printMsg("********************");
        }
    }
}
