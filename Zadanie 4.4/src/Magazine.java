import java.util.ArrayList;

public class Magazine extends Item {

	private String issue;
	private String publYear;
	private String periodType;
	
	/***** KONSTRUKTORY *****/
	
	public Magazine() {
		super();
		this.issue = "Unknown";
		this.publYear = "Unknown";
		this.periodType = "Unknown";		
	}
	
	public Magazine(String title, String issue, String publYear, String periodType, ArrayList<Item> list) {
		super(title, "magazine", list);
		this.issue = issue;
		this.publYear = publYear;
		this.periodType = periodType;
	}

	/***** GETTERY I SETTERY *****/
	
	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getPublYear() {
		return publYear;
	}

	public void setPublYear(String publYear) {
		this.publYear = publYear;
	}

	public String getPeriodType() {
		return periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}
	
	
	/******** METODY ********/
	
	public String toString() {
		return "Magazine [title = \""+getTitle()+"\", publYear = "+publYear+", issue number = "+issue+
				", periodicity = "+periodType+"]";
	}
	
	
	
	
}
