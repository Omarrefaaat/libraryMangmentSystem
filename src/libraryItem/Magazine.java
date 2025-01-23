package libraryItem;

import java.util.Date;

public class Magazine extends LibraryItem {
    private String publisher;
    private int issueNumber ;
    private Date publcationDate;

   public Magazine (String publisher , int issueNumber , String title , boolean isAvailable ){
       this.publisher =publisher;
       this.issueNumber=issueNumber;
       this.title=title;


   }
}
