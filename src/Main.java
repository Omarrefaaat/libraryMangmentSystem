import libraryItem.Book;
import libraryItem.Dvd;
import libraryItem.Magazine;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setIsbn("sd255");
        book.setAuthor("ali");
        book.setAvailable(true);
        book.setTitle("abc");
        book.displayDetails();

        Dvd dvd = new Dvd();
        dvd.setAvailable(true);
        dvd.setTitle("ali");
        dvd.displayDetails();

        Magazine magazine = new Magazine("ahmed", 5165,"abc", true);
        magazine.displayDetails();





        
    }
}