package LibraryManagementSystem;

import java.util.Arrays;

public class library {
	private Book[] books;
	private int count;
	public library(int capacity) {
		books=new Book[capacity];
		count=0;
	}
	public void add(Book book) {
		if(count<books.length) {
			books[count]=book;
			count++;
		}
		else {
			System.out.println("Library is full");
		}
	}
	public Book linearsearchbytitle(String title) {
		for(int i=0;i<count;i++) {
			if(books[i].gettitle().equalsIgnoreCase(title)) {
				return books[i];
			}
		}
		return null;
	}
	public Book[] getbook() {
		return Arrays.copyOf(books, count);
}
	public void sortbookbytitle() {
		Arrays.sort(books,0,count,(book1,book2) -> book1.gettitle().compareToIgnoreCase(book2.gettitle()));
	}
	public Book binarysearchbytitle(String title) {
		int left=0;
		int right=count-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			int comp=books[mid].gettitle().compareToIgnoreCase(title);
			if(comp==0) {
				return books[mid];
			}
			else if(comp<0) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		library lib=new library(5);
		lib.add(new Book(1,"Handy the mock","Finle"));
		lib.add(new Book(2,"1984","George Orwell"));
		lib.add(new Book(3,"Banker","William"));
		
		System.out.println("Linear Search for 1984");
		System.out.println(lib.linearsearchbytitle("1984"));
		
		System.out.println("sorting for binary search");
		lib.sortbookbytitle();
		
		System.out.println("binary search for 1984");
		System.out.println(lib.binarysearchbytitle("1984"));
	}

}
