package LibraryManagementSystem;

public class Book {
	private int bookId;
	private String title;
	private String author;
	
	public Book(int bookId,String title,String author) {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	public int getbookid() {
		return bookId;
	}
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public String toString() {
		return "Book { "+" bookId :"+bookId+", title :"+title+", author :"+author+ '}';
	}

}
