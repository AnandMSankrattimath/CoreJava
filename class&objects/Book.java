class Book{
	String category;
	String name;
	String writer;
	String language;
	String publisher;
	String printLength;
	double price;
	int readingAge;

	Book(String cat,String nm,String wr,String lang,String pub,String pl,double pri,int rag){
	category =cat;
	name = nm;
	writer = wr;
	language = lang;
	publisher = pub;
	printLength = pl;
	price = pri;
	readingAge = rag;
	} //

	void aboutbook(){
	System.out.println("Category : "+category);
	System.out.println("Name : "+name);
	System.out.println("Writer : "+writer);
	System.out.println("Language : "+language);
	System.out.println("Publisher : "+publisher);
	System.out.println("PrintLength : "+printLength);
	System.out.println("Price : "+price);
	System.out.println("ReadingAge from : "+readingAge+ "\n");
	}//

	void priceFormats(){
	System.out.println("For Kindle : 120 rs \n");
	System.out.println("For AudioBook : 130.33 rs \n");
	System.out.println("For Paperback : 333.30 rs \n");
	System.out.println("For Hardcover : 1120 rs \n");
	}//

	void read(){
	System.out.println("You can Read this book \n");
	}//

	void comment(){
	System.out.println("You can leave your comment here !!! \n");
	}//

	void review(){
	System.out.println("You can Review \n");
	}//

	public static void main(String args[]){
	Book bk1 = new Book("Biography","The Bose","Shoojit Sarcar","kannada","MccGrill","328 pages",323.99,10);
	bk1.aboutbook();
	bk1.priceFormats();
	bk1.read();
	bk1.comment();
	bk1.review();
	}
	


}