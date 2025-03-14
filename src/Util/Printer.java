package Util;

import libraryItem.LibraryItem;

import java.util.ArrayList;

public class Printer {

    public static void printMsg (String msg){
        System.out.println(msg);
    }


    public static void printMsg (int msg){
        System.out.println(msg);
    }

    public static void printMsg (boolean msg){
        System.out.println(msg);
    }

    public static void printLibItemList (ArrayList<LibraryItem> libraryItems){
        for (LibraryItem item : libraryItems ) {
            item.displayDetails();
            printMsg("********************");
        }
    }
}
