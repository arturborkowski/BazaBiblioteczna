import java.util.ArrayList;

public abstract class Item {

	private String title;
	private String itemType;
	private int number;
	
	
	/*************** KONSTRUKTORY ******************/
	
	
	public Item() {
		title = "Unknown";
		itemType = "Unknown";
		number = -1;
	}
	
	public Item(String title, String itemType, ArrayList<Item> list) {
		this.title = title;
		this.itemType = itemType;
		list.add(this);
		this.number = list.indexOf(this)+1;
	}
	
	
	
	
	/**************** GETTERY I SETTERY *******************/
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	public String getItemType() {
		return this.itemType;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	
	public abstract String toString();
	
	
}
