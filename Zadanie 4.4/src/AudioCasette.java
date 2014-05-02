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
			System.out.println("Podaj wykonawc�: ");	
			artists.add(czyt.nextLine());
			System.out.println("Wpisz piosenk�: ");
			songs.add(czyt.nextLine());
			System.out.println("Czy chcesz dodac kojeny utw�r? [t/n]");
			wybor = czyt.nextLine();
		} while(!wybor.equals("n"));
	}
	
	
	void getArtists() {
		System.out.println("Arty�ci wyst�puj�cy na kasecie to: ");
		for(String x: artists) {
			System.out.println(x);
		}
	}
	
	void getSongs() {
		System.out.println("Tytu�y piosenek na p�ycie to: ");
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
