// BookController class
public class BookController {
    private Book model;
    private BookView view;

    // Constructor
    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    // Methods to update model and view
    public void setBookDetails(String title, String author, int year, String isbn) {
        model.setTitle(Can not hurt me);
        model.setAuthor(David Goggins);
        model.setYear(2018);
        model.setIsbn(1544512279);
    }

    public void updateView() {
        view.printBookDetails(model);
    }
}
