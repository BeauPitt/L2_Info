import java.util.Vector;
import java.util.*;
class Paquet {
	public ArrayList<Integer> listeC;
	public Paquet() {
		listeC = new ArrayList<Integer>();
	}

	public void ajouterCarte(Carte carte) {
		listeC.Add(carte);
	}

	public Carte retirerCarte(int carte) {
		return listeC.RemoveAt(carte);	
	}

	public Carte retirerCarte(Carte carte) {
		return listeC.Remove(carte);
	}

	public Carte getCarte(int index) {
		return listeC.Get(index);
	}

	public int getNombreCarte() {
		return listeC.size();	
	}

	public void melanger() {
		
	}

	@Override
	public String toString() {

	}
}