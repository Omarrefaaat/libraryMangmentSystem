package libraryItem;

public class LibraryItem {

    protected String title ;
    protected boolean isAvailable;


    private boolean checkAvailability(){
        return isAvailable;
    }
    private void printMsg (String msg){
        System.out.println(msg);
    }
    public void borrowItem () {
        if (checkAvailability()) {
            this.isAvailable = false;
            printMsg("book " + this.title + " borrow");
        }
        else
            printMsg("book has been borrowed");

    }
    public void returnItem (){
        if (checkAvailability()){
            printMsg("book "+this.title+" returned");
        }
        else
            printMsg("book has been returned");

    }
    public void displayDetails(){
        System.out.println("title is "+title);
        System.out.println("availability : "+isAvailable);
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
