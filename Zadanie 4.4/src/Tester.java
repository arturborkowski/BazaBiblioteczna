import java.io.IOException;

public class Tester {


	public static void main(String[] args) throws IOException {
		
		ItemBase materials = new ItemBase();
		
		
// dodawanie dowolnego materia³u bibliotecznego do bazy		
		Book a = new Book("Dzieci z Bulerbyn", "Astrid Lindgren", "WSiN","1987", "82-1231-4323-34-1", materials.base);
		Magazine b = new Magazine("CD-Action", "1(247)", "2013", "monthly", materials.base);
		Book c = new Book("Akademia Pana Kleksa", "Jan Brzechwa", "PeGaz", "1964", "82-3123-42342-12-5", materials.base);
		Magazine d = new Magazine("Gazeta Wyborcza", "32(7823)", "1999", "daily", materials.base);
		Magazine e = new Magazine("Newsweek", "1(123)", "2004", "monthly", materials.base);
		Book f = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", "WSiN", "2008", "21-3123-1231-32-1", materials.base);
		Book g = new Book("WiedŸmin", "Andrzej Sapkowski", "Prószyñski i s-ka", "2001", "82-213-4124-21-2", materials.base);
		VHS h = new VHS("Kickboxer", "Jean-Claude Van Damme", materials.base);
		CD_DVD i = new CD_DVD("Settlers IV", "Jasio Kowalski", materials.base);
		
		
// zapis zaewidencjonowanych materia³ów do pliku		
		materials.zapisDoPliku("lista.txt", materials.base);
		
// odczyt i wyœwietlanie materia³ów z pliku		
		materials.odczyt("lista.txt");
		
// wyœwietlanie elementów bazy skategoryzowanych pod wzglêdem typu
		
		
		
		System.out.println("\nKsi¹¿ki: ");		
		materials.showBooks();
		
		System.out.println("\nCzasopisma: ");		
		materials.showMagazines();
		
		System.out.println("\nKasety VHS: ");		
		materials.showVHS();
		
		System.out.println("\nP³yty CD i DVD z programami: ");		
		materials.showCDs_DVDs();
	}

}
