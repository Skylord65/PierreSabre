package personnages;

public class Traitre extends Samourai{
	
	private int niveauTraitrise;
	
	public Traitre(String maitre, String prenom, String boisson, int money, int niveauTraitrise) {
		super(maitre ,prenom, boisson, money);
		this.niveauTraitrise = niveauTraitrise;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			commercant.perdreArgent(((commercant.getArgent())/10)*2);
			gagnerArgent(((commercant.getArgent())/10)*2);
			niveauTraitrise++;
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance>0) {
			memoire[0].gagnerArgent(getArgent()/20);
			perdreArgent(getArgent()/20);
			if (niveauTraitrise > 0) {
				niveauTraitrise -= 1;
			}
		}
	}
}
