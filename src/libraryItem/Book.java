package libraryItem;
import Util.Printer;

public class Book extends LibraryItem {
    private String author;
    private int isbn ;
    private int numberOfPages;

    public Book(String title, int isbn, String author, int numberOfPages,int itemCount) {
        super(title,itemCount);
        this.isbn = isbn;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayDetails(){
        Printer.printMsg("title is : "+title);
        Printer.printMsg("availability : "+isAvailable);
        Printer.printMsg("author : "+author);
        Printer.printMsg("isbn : "+isbn);
        Printer.printMsg("numberOfPages : "+numberOfPages);
        Printer.printMsg("item count "+itemCount);
        System.out.println("--------------");
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public int getIsbn() {

        return isbn;
    }

    public void setIsbn(int isbn) {

        this.isbn = isbn;
    }

    public int getNumberOfPages() {

        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {

        this.numberOfPages = numberOfPages;
    }
}
