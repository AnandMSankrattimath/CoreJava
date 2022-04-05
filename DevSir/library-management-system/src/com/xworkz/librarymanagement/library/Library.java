package com.xworkz.librarymanagement.library;

import com.xworkz.librarymanagement.DTO.BookDTO;

public class Library {

	public BookDTO bookDTO[]; // Declaring the BookDTO type array i.e bookDTO[];
	int index;
	
	//Library Constructor 
	public Library(int size) {
		
		bookDTO = new BookDTO[size];
	}
	
	//creating book details method
	//   ;;;;;;;;;CREATE OPERATION;;;;;;;;
	public boolean createBookDetails(BookDTO dto) {
		System.out.println("Inside the createBookDetails()");
		System.out.println("Args : Book Details");
		boolean isBookAdded = false;;
		if (dto!=null) {
			bookDTO[index++]=dto;
			isBookAdded = true;
		}
		else {
			System.out.println(" Book is  not added");
		}
		
		System.out.println("End of the createBookDetails()");
		return isBookAdded;	
	}
	
	//get all the details at once....
	public BookDTO getAllBookDetails() {
		System.out.println("Starts the getAllBookDetails()");
		BookDTO bdto=null;
		for (int i = 0; i < bookDTO.length; i++) {
			//System.out.println(bookDTO[i]);
			bdto=bookDTO[i];
			
		}
		
		System.out.println(" End of the getAllBookDetails()");
		return bdto;
	}
	
	
	//get Book Details by Book Id
	public BookDTO getBookDetailsByBookId(int id) {
		System.out.println(" Starts the getBookDetailsByBookId()");
		System.out.println(" Args 1 : Book ID "+id);
		BookDTO bDTO=null;
		for(int i=0;i<bookDTO.length;i++) {
			if(bookDTO[i].getBookId()==id) {
				bDTO=bookDTO[i];
			}
			else {
				System.out.println("Book details not found by the book id"+id);
			}
			
		}
		System.out.println("End of the getBookDetailsByBookId()");
		return bDTO;
	}
	
	//update book edition by book id
	
	public boolean updateBookEditionByBookId(int id,int edition) {
		System.out.println(" Starts the updateBookEditionByBookId()");
		System.out.println("args 1 : Book ID "+id);
		System.out.println("args 2 : Book Edition "+edition);
		boolean isBookEditionUpdated=false;
		for (int i = 0; i < bookDTO.length; i++) {
			if(bookDTO[i].getBookId()==id) {
				bookDTO[i].setBookEdition(edition);
				isBookEditionUpdated=true;
			}
			else {
				System.out.println("Book Details not Found by the book id "+id);
			}
		}
		System.out.println("End of the updateBookEditionByBookId()");
		return isBookEditionUpdated;
	}
	
	// Delete the book details by Book Id
	
	public boolean deleteBookDetialsByBookId(int id) {
		System.out.println("Starts the deleteBookDetialsByBookId()");
		System.out.println("args 1 : Book id"+id);
		boolean isBookDeleted=false;
		BookDTO bdata=null;
		for(int i=0;i<bookDTO.length;i++) {
			if (bookDTO[i].getBookId()==id) {
				bookDTO[i]=null;
				isBookDeleted = true;
	
			}
			else {
				System.out.println("Book detials not found by the book id"+id);
			}
		}
		System.out.println(" End of the deleteBookDetialsByBookId()");
		return isBookDeleted;
	}
	
	
}



