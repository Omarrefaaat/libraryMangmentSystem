import libraryItem.Book;
import libraryItem.Magazine;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setIsbn("sd255");
        book.setAuthor("ali");
        book.setAvailable(true);
        book.setTitle("abc");

        Magazine magazine = new Magazine("omar",236,"mod",true);
        magazine.borrowItem();




        
    }
}