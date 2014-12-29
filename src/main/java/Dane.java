import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Dane {
	
public static void main(String[] args) throws FileNotFoundException {
	
ArrayList<Double> tablica = new ArrayList<Double>();
	
try {	
		String wiersz;
	    FileReader fr = new FileReader("dane.txt");
	    Scanner plik = new Scanner(fr);
		
		 while(plik.hasNext()) {
             wiersz= plik.next();
             //System.out.print(wiersz + " ");
             double liczba = Double.parseDouble(wiersz.trim());
			 tablica.add(new Double(liczba));
             }
		 plik.close();
		 
} catch (Exception e) {
    System.err.println("Wystąpił błąd przy wczytywaniu danych");
    e.printStackTrace();
}
		
		
		System.out.println("Przed sortowaniem: " + tablica);
		Collections.sort(tablica);
		System.out.println("Po sortowaniu: " + tablica);
		
		Double tablica2[] = new Double[tablica.size()];
		tablica2 = tablica.toArray(tablica2);
		
		double suma = 0;
		double srednia = 0;
		
		for(double i : tablica2) suma += i;
		System.out.println("Suma: " + suma);
		
		for(double i : tablica2) srednia += i;
		System.out.println("Średnia arytmetyczna: " + srednia/tablica.size());
	}

}
