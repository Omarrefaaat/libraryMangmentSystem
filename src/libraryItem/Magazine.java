package libraryItem;

import java.util.Date;

public class Magazine extends LibraryItem {
    private String publisher;
    private int issueNumber ;
    private Date publcationDate;
@Override
    public void displayDetails(){
        System.out.println("title is "+title);
        System.out.println("availability : "+isAvailable);
        System.out.println("publisher : "+publisher);
        System.out.println("issueNumber : "+issueNumber);
    }

   public Magazine (String publisher , int issueNumber , String title , boolean isAvailable ){
       this.title=title;
       this.isAvailable=isAvailable;
       this.publisher =publisher;
       this.issueNumber=issueNumber;



   }
}
