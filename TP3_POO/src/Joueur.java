import java.util.Scanner;
class Joueur {
	private String nom;
	protected Paquet p;

	public Joueur(String n) {
		nom = n;
	}

	public void nouveauJeu() {

	}

	public Carte jouer() { 
		Carte carte = choisirCarte();
		paquet.retirerCarte(carte);
		return carte;
	}

	public Carte choisirCarte() {
		System.out.prinln("Choisir une carte");
		Scanner s = new Scanner(input);
		return paquet.getCarte(s.nextInt());
	}

	public void recupererCarte(Carte c) {
		paquet.ajouterCarte(c);
	}

	public boolean aPerdu() {
		if (paquet.getNombreCarte() > 0) {
			return false;
		}
		return true;
	}

	public String toString() {

	}
}