package libraryItem;

public class Book extends LibraryItem {
    private String author;
    private String isbn ;
    private int numberOfPages;

    @Override
    public void displayDetails(){
        System.out.println("title is : "+title);
        System.out.println("availability : "+isAvailable);
        System.out.println("author : "+author);
        System.out.println("isbn : "+isbn);
        System.out.println("numberOfPages : "+numberOfPages);
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }

    public int getNumberOfPages() {

        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {

        this.numberOfPages = numberOfPages;
    }
}
