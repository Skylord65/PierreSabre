package personnages;

public class Yakuza extends Humain{
	
	protected String clan;
	protected int reputation;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
		this.clan = clan;
		this.reputation = 0;
		
	}

	public void extorquer(Commercant victime) {
		int arg = victime.seFaireExtorquer();
		argent += arg;
		reputation++;
		parler("J'ai piqué les " + arg + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
	}
}
