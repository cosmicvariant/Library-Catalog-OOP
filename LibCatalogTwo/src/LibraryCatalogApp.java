import java.util.Scanner;

public class LibraryCatalogApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Catalog System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Books");
            System.out.println("4. List All Books");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice: ");

            int choice = myScanner.nextInt();
            myScanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Please enter Book Title: ");
                    String title = myScanner.nextLine();
                    System.out.print("Please enter Author Name: ");
                    String author = myScanner.nextLine();
                    System.out.print("Please enter ISBN: ");
                    String isbn = myScanner.nextLine();
                    Book book = new Book(title, author, isbn);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Please enter ISBN of the Book to Remove: ");
                    String removeIsbn = myScanner.nextLine();
                    library.removeBook(removeIsbn);
                    break;

                case 3:
                    System.out.print("Enter Keyword to Search: ");
                    String keyword = myScanner.nextLine();
                    library.searchBook(keyword);
                    break;

                case 4:
                    library.listBooks();
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    myScanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
