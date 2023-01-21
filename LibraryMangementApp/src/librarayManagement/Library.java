package librarayManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
List<Book> bookList = new ArrayList<Book>();
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public boolean isEmpty(){
		return bookList.isEmpty();
	}
	
	List<Book> viewAllBooks(){
		return bookList;
	}
	
	List<Book> viewBooksByAuthor(String author){
		List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        if (booksByAuthor.isEmpty()) {
            System.out.println("The list is empty");
            return booksByAuthor;
        }
        return booksByAuthor;
		
	}
	
	 public int countNoOfBook(String bookName) {
		 int count = 0;
	        for (Book book : bookList) {
	            if (book.getBookName().equalsIgnoreCase(bookName)) {
	                count++;
	            }
	        }
	        return count;
	 }
}
