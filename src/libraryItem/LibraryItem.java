package libraryItem;

import Util.Printer;

public abstract class LibraryItem {

    protected String title ;
    protected boolean isAvailable;
    protected int itemCount;

    public LibraryItem(String title , int itemCount) {
        this.title = title;
        this.isAvailable = itemCount > 0;
        this.itemCount = itemCount;
    }

    private boolean checkAvailability(){
        return isAvailable;
    }
    
    public void borrowItem () {
        if (!isAvailable) {
            Printer.printMsg("this item not available");
        }
        else
            itemCount-- ;
        Printer.printMsg("the item "+this.title +" :  borrowed and we have "+ this.itemCount );
    }

    public void returnItem (){
            itemCount++ ;
            Printer.printMsg("the item "+this.title+" returned and we have "+ this.itemCount );
        }

    public abstract void displayDetails();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public boolean isAvailable() {
        isAvailable = itemCount >0 ;
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
