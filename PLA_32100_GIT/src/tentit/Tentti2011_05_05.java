package tentit;

import java.util.Scanner;

public class Tentti2011_05_05 {

	public static void main(String[] args) {
		Hirsipuu hirsipuu = new Hirsipuu();
		hirsipuu.pelaa();

	}

}

class Hirsipuu {
	private Scanner lukija = new Scanner(System.in);
	private String Arvattava = "DIPLOMI-INSINOORI";
	private String arvaus =    "*******-*********";

	public void pelaa() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Anna kirjain");
			String kirjain = lukija.nextLine();
			arvaaMerkki(kirjain);
		}
	}

	public void arvaaMerkki(String kirjain) {
		kirjain = kirjain.toUpperCase();
		char merkki = kirjain.charAt(0);
		String uusiArvaus = "";
		for (int i = 0; i < Arvattava.length(); i++) {
			if (Arvattava.charAt(i) == merkki) {
				uusiArvaus += merkki;
			} else {
				uusiArvaus += arvaus.charAt(i);
			}
		}
		arvaus = uusiArvaus;
		System.out.println(arvaus);
	}
}