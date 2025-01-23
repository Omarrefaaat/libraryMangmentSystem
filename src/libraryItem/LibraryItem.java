package libraryItem;

public class LibraryItem {

    protected String title ;
    protected boolean isAvailable;

    public boolean checkAvailability(){
        return false;
    }
    public void borrowItem (){

    }
    public void returnItem (){

    }
    public void displayDetails(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
