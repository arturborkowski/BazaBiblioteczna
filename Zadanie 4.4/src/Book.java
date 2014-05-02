import java.util.ArrayList;

public class Book extends Item {
	
	private String author;
	private String publYear;
	private String editor;
	private String isbnNumber;
	
	
	/***** KONSTRUKTORY *****/
	
	public Book() {
		super();
		this.author = "Unknown";
		this.editor = "Unknown";
		this.publYear = "Unknown";
		this.isbnNumber = "Unknown";
	}
	
	
	public Book(String title, String author, String editor, String publYear,  String isbn, ArrayList<Item> list) {
		super(title, "book", list);
		this.author = author;
		this.editor = editor;
		this.publYear = publYear;
		this.isbnNumber = isbn;
		
	}
	
	
	/***** GETTERY I SETTERY *****/
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public String getEditor() {
		return editor;
	}
	
	public void setPublYear(String publYear) {
		this.publYear = publYear;
	}
	
	public String getPublYear() {
		return publYear;
	}
	public void setIsbnNumber(String isbn) {
		this.isbnNumber =isbn;
	}
	
	public String getIsbnNumber() {
		return isbnNumber;
	}
	

	/****** METODY ******/
	
		public String toString() {
		return "Book [title = \"" +getTitle()+"\" author = " + author + ", publYear = " + publYear
				+ ", editor = " + editor + ", isbnNumber= " + isbnNumber + "] ";
	}
	
	
	
	
	

}
