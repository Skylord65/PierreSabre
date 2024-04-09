package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public int seFaireExtorquer() {
		int ar = argent;
		perdreArgent(argent);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return ar;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		this.argent += argent;
	}
	
}
