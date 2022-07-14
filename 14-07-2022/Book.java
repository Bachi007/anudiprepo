class Book implements Comparable<Book>{
	int bookId;
	String bookName;
	float bookPrice;
	Book(int bookId,String bookName,float bookPrice)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
	public int compareTo(Book b){
		return bookPrice>b.bookPrice ? 1:-1;
	}
}