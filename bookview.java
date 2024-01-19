// BookView class
public class BookView {
    // Method to display book details
    public void printBookDetails(Book book) {
        System.out.println("Book Title:Can not hurt me " + book.getTitle());
        System.out.println("Author:David Goggins " + book.getAuthor());
        System.out.println("Year:2018 " + book.getYear());
        System.out.println("ISBN:1544512279 " + book.getIsbn());
        System.out.println();
    }
}
