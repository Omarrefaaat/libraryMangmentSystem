package customer;

import libraryItem.LibraryItem;

public class PremiumCustomer extends Customer implements BuyPrivilege,BorrowingPrivilege,BrowsePrivilege {

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
