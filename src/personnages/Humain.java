package personnages;

public class Humain {
	
	protected String nom;
	protected String boisson;
	protected int argent;
	protected int nbConnaissance;
	protected Humain[] memoire;
	
	public Humain(String nom, String boisson, int argent) {
	this.nom = nom;
	this.boisson = boisson;
	this.argent = argent;
	this.memoire = new Humain[30];
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println(nom + " : " + "\"" + texte + "\"");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte; 
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. je ne peux m�me pas m'offrir un(e) " + bien + " � " + prix + " sous.");
		} else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " � " + prix + " sous.");
			perdreArgent(prix);
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance < 30) {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance++;
		} else {
			memoire[0] = null;
			Humain temp;
			for (int i = 1; i<(nbConnaissance); i++) {
				temp = memoire[i];
				memoire[i-1] = temp;
			}
			memoire[29] = autreHumain;
		}
	}
	
	public void listerConnaissance() {
		if (nbConnaissance != 0) {
			String text = "";
			for (int i = 0; i<nbConnaissance-1; i++) {
				text += memoire[i].getNom() + ", ";
			}
			System.out.println("Je connais beaucoup de monde dont : " + text + memoire[nbConnaissance-1].getNom());
		}
	}
}
