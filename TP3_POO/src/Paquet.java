import java.util.*;
class Paquet {
	public ArrayList<Carte> listeC;
	public Paquet() {
		listeC = new ArrayList<Carte>();
	}

	public void ajouterCarte(Carte carte) {
		listeC.add(carte);
	}

	public Carte retirerCarte(int carte) {
		Carte tmp = listeC.get(carte);
		listeC.remove(carte);
		return tmp;	
	}

	public Carte retirerCarte(Carte carte) {
		Carte tmp = listeC.get(carte.getValeur());
		listeC.remove(carte);
		return tmp;	
	}

	public Carte getCarte(int index) {
		return listeC.get(index);
	}

	public int getNombreCarte() {
     	return listeC.size();	
	}

	public void melanger() {
		Collections.shuffle(listeC);
	}

	@Override
	public String toString() {
		return " " + listeC.toString();
	}
}