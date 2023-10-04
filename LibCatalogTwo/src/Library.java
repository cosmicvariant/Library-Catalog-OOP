import java.util.ArrayList;
import java.util.List;


class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void searchBook(String keyword) {
        System.out.println("\nSearch Results:");
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())
                    || book.getIsbn().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public void listBooks() {
        System.out.println("\nLibrary Catalog:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}







