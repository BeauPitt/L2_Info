import java.util.Scanner;
class Joueur {
	private String nom;
	protected Paquet p;
	private Scanner s;

	public Joueur(String n) {
		nom = n;
	}

	public void nouveauJeu() {
		this.p = new Paquet(); 
	}

	public Carte jouer() { 
		Carte carte = choisirCarte();
		this.p.retirerCarte(carte);
		return carte;
	}

	public Carte choisirCarte() {
		System.out.println("Choisir une carte");
		s = new Scanner(System.in);
		return this.p.getCarte(s.nextInt());
	}

	public void recupererCarte(Carte c) {
		p.ajouterCarte(c);
	}

	public boolean aPerdu() {
		if (p.getNombreCarte() > 0) {
			return false;
		}
		return true;
	}

	public String toString() {
		return "nom : " + nom + " Paquet :" + p.toString();
	}
}