package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public int seFaireExtorquer() {
		int ar = argent;
		perdreArgent(argent);
		return ar;
	}
	
	public void recevoir(int argent) {
		this.argent += argent;
	}
	
}
