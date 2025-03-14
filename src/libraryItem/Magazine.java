package libraryItem;

import Util.Printer;


public class Magazine extends LibraryItem {
    private String publisher;



    @Override
    public void displayDetails(){
        Printer.printMsg("title is "+title);
        Printer.printMsg("availability : "+isAvailable);
        Printer.printMsg("publisher : "+publisher);
        Printer.printMsg("item count "+itemCount);
        System.out.println("--------------");
    }

   public Magazine (String publisher ,  String title , boolean isAvailable , int itemCount ){
       super(title,itemCount);
       this.publisher =publisher;
   }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
