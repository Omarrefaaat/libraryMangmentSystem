package customer;

import libraryItem.LibraryItem;

public class PremiumCustomer extends Customer implements BuyPrivilege,BorrowingPrivilege,BrowsePrivilege {

    public PremiumCustomer(String firstName, String lastName, String phoneNumber) {
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

    @Override
    public String buyItem() {
        return "";
    }
}
