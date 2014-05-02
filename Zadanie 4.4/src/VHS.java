import java.util.ArrayList;

public class VHS extends Item{

String author;


/* KONSTRUKTORY */

public VHS() {
	super();
	author = "Unknown";
}

public VHS(String title, String author, ArrayList<Item> list) {
	super(title, "VHS", list);
	this.author = author;
}


/* GET i SET */

public void setAuthor(String author) {
	this.author = author;
}

public String getAuthor() {
	return this.author;
}


/* METODY */

public String toString() {
	return "VHS [title = \""+getTitle()+"\", author = "+author+"]";
}


}
