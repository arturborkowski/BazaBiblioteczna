import java.util.ArrayList;

public class CD_DVD extends Item {

	private String owner;
	
	/* KONSTRUKTORY */
	
	public CD_DVD() {
		super();
		this.owner = "Unknown";
	}
	
	public CD_DVD(String title, String owner, ArrayList<Item> list) {
		super(title, "CD/DVD", list);
		this.owner = owner;
	}
	
	/* GETTER I SETTER */
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	/* METODY */
	
	public String toString() {
		return "CD_DVD [title = \""+getTitle()+"\", owner = "+getOwner()+"]";
	}

}
