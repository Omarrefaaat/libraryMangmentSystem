package customer;

import libraryItem.LibraryItem;

public class MemberCustomer extends Customer implements BrowsePrivilege , BorrowingPrivilege {
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
