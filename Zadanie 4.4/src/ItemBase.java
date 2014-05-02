import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class ItemBase {

	ArrayList<Item> base = new ArrayList<Item>();
	private int ew = 1;
	
	
	/***** METODY *****/
	
	
//metoda dodaje przedmiot do bazy	
	public void add(Item i) {
		base.add(i);
		i.setNumber(ew++);
	}
	
// metoda wy�wietla ca�� baz�	
	public void displayBase() {
		for(Item x: base) {
			System.out.println(showItemInfo(x));
		}
	}
	
// metoda wy�wietla wszystkie ksi��ki	
	public void showBooks() {
		for(Item x: base) {
			if(x.getItemType().equals("book")) {
				System.out.println(showItemInfo(x));

			}
		}		
	}
	
// metoda wy�wietla czasopisma	
	public void showMagazines() {
		for(Item x: base) {
			if(x.getItemType().equals("magazine")) {
				System.out.println(showItemInfo(x));
			}
		}		
	}
	
// metoda wy�wietla wszystkie kasety VHS
	public void showVHS() {
		for(Item x: base) {
			if(x.getItemType().equals("VHS")) {
				System.out.println(showItemInfo(x));
			}
		}		
	}
	
// metoda wy�wietla wszystkie p�yty CD i DVD z programami
	public void showCDs_DVDs() {
		for(Item x: base) {
			if(x.getItemType().equals("CD/DVD")) {
				System.out.println(showItemInfo(x));
			}
		}		
	}
	

// metda wy�wietla informacje poszczeg�lnych przedmiot�w	
	public String showItemInfo(Item i) {
		return "Nr. "+i.getNumber()+". ("+i.getItemType()+") "+i;
	
	}



// metoda zapisuj�ca do pliku tekstowego wszystkie elementy bazy
	public void zapisDoPliku(String nazwa, ArrayList<Item> list) throws IOException {
		FileWriter plikWyjsciowy = null;
		
		try {
			plikWyjsciowy = new FileWriter(nazwa);
			for(Item x: list) {
				String text = showItemInfo(x);
				plikWyjsciowy.write(text);
				plikWyjsciowy.write("\n");
			}
			
		} finally {
			if(plikWyjsciowy != null) {
				plikWyjsciowy.close();
			}
		}	
	}
	

// metoda odczytuj�ca tekst z pliku znak po znaku	
	public void odczyt(String nazwa) throws IOException {
		
		FileReader plikWejsciowy = null;
		
		try {
			plikWejsciowy = new FileReader(nazwa);
			int c;
			
			while((c = plikWejsciowy.read()) != -1) {
				System.out.print((char)c);
			}
		} finally {
			if (plikWejsciowy != null) {
				plikWejsciowy.close();
			}
		}
		
		
		
	} 
	
	
	
} // koniec klasy



