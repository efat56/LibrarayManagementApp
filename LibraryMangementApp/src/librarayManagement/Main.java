package librarayManagement;


import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            System.out.println("**************************************");
           
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                	System.out.println();
                    System.out.print("Enter the isbn no: ");
                    int isbn = scanner.nextInt();
                    System.out.print("Enter the book name: ");
                    String bookName = scanner.next();
                    System.out.print("Enter the author name: ");
                    String author = scanner.next();
                    library.addBook(new Book(isbn, bookName, author));
                    System.out.println("Book added successfully");
                    break;
                case 2:
                    if (library.isEmpty()) {
                        System.out.println("No books in the library");
                    } else {
                        for (Book book : library.viewAllBooks()) {
                            System.out.println("ISBN no: " + book.getIsbn());
                            System.out.println("Book name: " + book.getBookName());
                            System.out.println("Author name: " + book.getAuthor());
                            System.out.println("==================================");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the author name: ");
                    String authorName = scanner.next();
                    List<Book> booksByAuthor = library.viewBooksByAuthor(authorName);
                    if (booksByAuthor.isEmpty()) {
                        System.out.println("None of the book published by the author " + authorName);
                    } else {
                        for (Book book : booksByAuthor) {
                            System.out.println("ISBN no: " + book.getIsbn());
                            System.out.println("Book name: " + book.getBookName());
                            System.out.println("Author name: " + book.getAuthor());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter the book name: ");
                    String name = scanner.next();
                    int count = library.countNoOfBook(name);
                    System.out.println("Number of books with the name " + name + ": " + count);
                    break;
                case 5:
                    System.out.println("Thank You..!!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
    }
}
