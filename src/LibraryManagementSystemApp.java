import customer.BuyPrivilege;
import customer.PremiumCustomer;
import dataBase.LibraryItemDataStorage;

import java.util.ArrayList;

public class LibraryManagementSystemApp {

    LibraryItemDataStorage dataBase ;

    LibraryManagementSystemApp(){
        dataBase =new LibraryItemDataStorage();
    }

    public void run (){

        ArrayList<BuyPrivilege> list = new ArrayList<>();
        PremiumCustomer g1 = new PremiumCustomer();
        list.add(g1);
    }

}
