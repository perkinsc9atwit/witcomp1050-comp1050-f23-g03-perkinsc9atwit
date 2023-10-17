package test;

public class Book {
	
	final private String title;
	final private String author;
	private static int booksSold = 0;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		booksSold++;
		}
	
	public String getTitle() {
		return title;
		}
	
	public String getAuthor() {
		return author;
		}
		
	public static int getNumBooks() {
		return booksSold;
		}
	
	@Override
	public String toString() {
		return String.format("\"%s\" by %s", title, author);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Book) {
				final Book b = (Book) o;
				return (b.title.equals(title) && b.author.equals(author));
		} 
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		final Book book1 = new Book("t1", "a1");
		final Book book2 = new Book("t2", "a1");
		final Book book3 = new Book("t1", "a1");
		
		System.out.printf("Books sold: %d%n", Book.getNumBooks());
		System.out.printf("%s and %s = %b%n", book1, book2, book1.equals(book2));
		System.out.printf("%s and %s = %b%n", book1, book3, book1.equals(book3));
		System.out.printf("%s and %s = %b%n", book2, book3, book2.equals(book3));
	}

}
