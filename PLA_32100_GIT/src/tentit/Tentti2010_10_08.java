package tentit;
/**
 * Tee sovellus luokka, joka kayttaa rajapintaa
 * 
 * @author miksa
 *
 */
public class Tentti2010_10_08 {

	public static void main(String[] args) {
		KonkreettinenLuokka konkreettinenLuokka = new KonkreettinenLuokka();
		konkreettinenLuokka.metodi();
		
		AliLuokka aliLuokka=new AliLuokka();
		aliLuokka.metodi();

	}

}

/**
 * Tee valitsemastasi aiheesta rajapintaluokka
 * 
 * @author miksa
 *
 */
interface RajapintaLuokka {
	public void metodi();
}

/**
 * Edellisen toteuttava abstrakti luokka.
 * 
 * @author miksa
 *
 */
abstract class Abstraktiluokka implements RajapintaLuokka {

}

/**
 * Periyta abstraktista luokasta konkreettinen luokka
 * 
 * @author miksa
 *
 */
class KonkreettinenLuokka extends Abstraktiluokka {
	@Override
	public void metodi() {
		System.out.println("Metodissa ollaan");

	}
	

}
/**
 * Ylimaaraista testailua (Ei vaadittu tehtavassa)
 * 
 * @author mika.saari@tut.fi
 * @version 8.44.21 21.4.2016
 *
 */
class AliLuokka extends KonkreettinenLuokka{
	/*@Override
	public void metodi() {
		System.out.println("Aliluokan Metodissa ollaan");

	}*/
}