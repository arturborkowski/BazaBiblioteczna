import java.util.Scanner;
import java.util.ArrayList;

public class AudioCasette extends Item{

	private ArrayList<String> artists = new ArrayList<String>();
	private ArrayList<String> songs = new ArrayList<String>();
	
	public AudioCasette() {
		super();	
	}
	
	public AudioCasette(String title, ArrayList<Item> list) {
		super(title, "Audio Casette", list);
		setSongs();		
	}
	
	
	void setSongs() {
		String wybor;
		Scanner czyt = new Scanner(System.in);	
		do {
			System.out.println("Podaj wykonawcê: ");	
			artists.add(czyt.nextLine());
			System.out.println("Wpisz piosenkê: ");
			songs.add(czyt.nextLine());
			System.out.println("Czy chcesz dodac kojeny utwór? [t/n]");
			wybor = czyt.nextLine();
		} while(!wybor.equals("n"));
	}
	
	
	void getArtists() {
		System.out.println("Artyœci wystêpuj¹cy na kasecie to: ");
		for(String x: artists) {
			System.out.println(x);
		}
	}
	
	void getSongs() {
		System.out.println("Tytu³y piosenek na p³ycie to: ");
		for(String x: songs) {
			System.out.println(x);
		}
	}
	
	void getInfo() {
		for(String x: artists) {
			System.out.println((artists.indexOf(x)+1)+". "+x+" - \""+songs.get(artists.indexOf(x))+"\"");
		}
	}
	
	public String toString() {
		return "AudioCasette [title = \""+getTitle()+"\", songs: \n";
	}

}
