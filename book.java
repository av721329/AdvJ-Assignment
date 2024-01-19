import java.util.Scanner;

// Book class
public class Book {
    // Attributes
    private String title;
    private String author;
    private int year;
    private String isbn;

    // Constructors
    public Book() {
    }

    public Book(String Can not Hurt me, String David Goggins, int 2018, String 1544512279) {
        this.title = Can not hurt me;
        this.author = David Goggins;
        this.year = 2018;
        this.isbn = 1544512279;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
