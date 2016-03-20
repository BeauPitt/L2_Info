import java.util.Scanner;
class Joueur {
	private String nom;
	protected Paquet p;
	private Scanner s;
	
	//Constructeur de Joueur
	public Joueur(String n) {
		nom = n;
	}

	//Crée un nouveau pasquet pour le Joueur
	public void nouveauJeu() {
		this.p = new Paquet(); 
	}

	//Choisi une carte puis la retire du paquet
	public Carte jouer() { 
		Carte carte = choisirCarte();
		this.p.retirerCarte(carte);
		return carte;
	}

	//Le Joueur choisi une carte
	public Carte choisirCarte() {
		System.out.println("Choisir une carte");
		s = new Scanner(System.in);
		return this.p.getCarte(s.nextInt());
	}

	//Cette méthode récupère une carte pour la rajouter dans le paquet du joueur
	public void recupererCarte(Carte c) {
		p.ajouterCarte(c);
	}

	//Renvoie false si le paquet du joueur contient encore des cartes, sinon renvoie true
	public boolean aPerdu() {
		if (p.getNombreCarte() > 0) {
			return false;
		}
		return true;
	}

	//Méthode toString qui renvoie le nom du joueur ainsi que le contenu de son paquet
	public String toString() {
		return "Nom : " + nom + " Paquet :" + p.toString();
	}
}