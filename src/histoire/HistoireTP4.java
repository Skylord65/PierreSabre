package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
	
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "Kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("Kombucha", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
