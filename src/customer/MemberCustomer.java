package customer;

import Util.Printer;
import libraryItem.LibraryItem;

public class MemberCustomer extends Customer implements BrowsePrivilege , BorrowingPrivilege {



    public MemberCustomer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }

    @Override
    public String borrowItem(LibraryItem item) {
        return "";
    }

    @Override
    public String returnItem(LibraryItem item) {
        return "";
    }

    @Override
    public void browseItem() {

    }
}
