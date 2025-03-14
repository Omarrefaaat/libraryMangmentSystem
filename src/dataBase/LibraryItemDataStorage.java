package dataBase;

import libraryItem.LibraryItem;

import java.util.ArrayList;

public class LibraryItemDataStorage {


    private ArrayList<LibraryItem> libraryItems ;

    public LibraryItemDataStorage(){
        libraryItems =new ArrayList<>();
    }



    public void add (LibraryItem libraryItem){
        libraryItems.add(libraryItem);
    }

    public void delete (LibraryItem libraryItem){
    libraryItems.remove(libraryItem);
    }

    public ArrayList<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public LibraryItem getLibraryItemByTitle (String title ){
        for (LibraryItem item : libraryItems){
            if (item.getTitle().equals(title))
                return item;
        }
        return null;
    }

    public String updateItem (LibraryItem oldLibraryItem , LibraryItem nwLibraryItem){
        LibraryItem item = getLibraryItemByTitle(oldLibraryItem.getTitle());
        if (item!=null){
            int oldItemIndex = libraryItems.indexOf(item);
            libraryItems.set(oldItemIndex,nwLibraryItem);
            return "item changed Successfully";
        }
        return "the require item not found";
    }
}
