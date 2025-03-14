package libraryItem;


import Util.Printer;

public class Dvd extends LibraryItem {
    private String director;
    private int duration;

    public Dvd(String title, String director, int duration,int itemCount) {
        super(title,itemCount);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        Printer.printMsg("title is : "+title);
        Printer.printMsg("availability : "+isAvailable);
        Printer.printMsg("director : "+director);
        Printer.printMsg("duration : "+duration);
        Printer.printMsg("item count "+itemCount);
        System.out.println("--------------");
    }

    public String getDirector() {

        return director;
    }

    public void setDirector(String director) {

        this.director = director;
    }

    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }
}
