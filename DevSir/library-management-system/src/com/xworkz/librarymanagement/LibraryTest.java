package com.xworkz.librarymanagement;

import java.util.Scanner;

import com.xworkz.librarymanagement.DTO.BookDTO;
import com.xworkz.librarymanagement.library.Library;

public class LibraryTest {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = scanner.nextInt();
	Library library = new Library(size);
	
	for (int i = 0; i <size; i++) {
		
	
	BookDTO dto = new BookDTO();
	System.out.println("Enter the Book Id");
	dto.setBookId(scanner.nextInt());
	
	System.out.println("Enter the Book Name");
	dto.setBookName(scanner.next());
	
	System.out.println("Enter the Book Author Name");
	dto.setBookAuthorName(scanner.next());
	
	System.out.println("Enter the Book Publisher Name");
	dto.setBookPublisher(scanner.next());
	
	System.out.println("Enter the Book Price");
	dto.setBookPrice(scanner.nextDouble());
	
	System.out.println("Enter the Book Edition");
	dto.setBookEdition(scanner.nextInt());
	
	library.createBookDetails(dto);
	}
	BookDTO allBookDetails=library.getAllBookDetails();
	System.out.println(allBookDetails);
	
	
	
	// get book details by the book id
	System.out.println(" Enter the book id");
	int bookId = scanner.nextInt();
	/*System.out.println("Before Updating the Edition");
	BookDTO bookDetailsByBookId = library.getBookDetailsByBookId(bookId);
	System.out.println(bookDetailsByBookId);
	
	//update book edition by book id
	System.out.println("Enter the new Edition");
	int newBookEdition = scanner.nextInt();
	System.out.println(library.updateBookEditionByBookId(bookId,newBookEdition));
	
	System.out.println("After Updating the Edition");
	 allBookDetails=library.getAllBookDetails();
	System.out.println(allBookDetails);*/
	
	System.out.println(library.deleteBookDetialsByBookId(bookId));
	 allBookDetails=library.getAllBookDetails();
	System.out.println(allBookDetails);
}
}
