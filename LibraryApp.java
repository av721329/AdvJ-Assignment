// LibraryApp class
public class LibraryApp {
    public static void main(String[] args) {
        // Create instances of Book model, BookView view, and BookController controller
        Book book = new Book();
        BookView view = new BookView();
        BookController controller = new BookController(book, view);

        // Demonstrate adding a new book and updating its information
        controller.setBookDetails("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978-3-16-148410-0");
        controller.updateView();

        // Demonstrate interactive input (optional extension)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title:Can not hurt me  ");
        String title = scanner.nextLine();
        System.out.print("Enter author:David Goggins");
        String author = scanner.nextLine();
        System.out.print("Enter year:2018 ");
        int year = scanner.nextInt();
        System.out.print("Enter ISBN:1544512279 ");
        String isbn = scanner.next();

        controller.setBookDetails(title, author, year, isbn);
        controller.updateView();
        
        // Optional: Implement features to manage a collection of books
        // (adding multiple books, deleting books, searching for books)
        // Implement additional methods in BookController as needed.
    }
}
