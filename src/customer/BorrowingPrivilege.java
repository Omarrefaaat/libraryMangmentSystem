package customer;

import libraryItem.LibraryItem;

public interface BorrowingPrivilege {
    String borrowItem (LibraryItem item) ;
    String returnItem (LibraryItem item) ;
}
