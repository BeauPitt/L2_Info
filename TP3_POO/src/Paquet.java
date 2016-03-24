import java.util.*;

class Paquet {
	public ArrayList<Carte> listeC;
	private Random ran;
	private Random ran2;
	private Random ran3;
	
	// Constructeur de la classe Paquet, crée uen liste de Carte
	public Paquet() {
		listeC = new ArrayList<Carte>();
	}

	// Ajoute une carte dans la liste
	public void ajouterCarte(Carte carte) {
		listeC.add(carte);
	}

	// Retire une carte de la liste et la renvoie
	public Carte retirerCarte(int carte) {
		Carte tmp = listeC.get(carte);
		listeC.remove(carte);
		return tmp;	
	}

	// Retire une Carte de la liste et la renvoie 
	public Carte retirerCarte(Carte carte) {
		Carte tmp = carte;
		listeC.remove(carte);
		return tmp;	
	}

	// Renvoie une carte à l'aide de son index
	public Carte getCarte(int index) {
		return listeC.get(index);
	}

	// Donne le nombre de carte dans le paquet
	public int getNombreCarte() {
     	return listeC.size();	
	}

	// Melange le Paquet x fois
	public void melanger() {
		int x = listeC.size();
		for (int i = 0; i<= x; i++) {
			Collections.shuffle(listeC);
		}
	}

	@Override
	// Méthode toString renvoie le Paquet
	public String toString() {
		return " " + listeC.toString();
	}
}