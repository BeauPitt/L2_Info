import java.util.*;

class Ordinateur extends Joueur {
	Random ran;
	
	public Ordinateur(String nom) {
		super(nom);
		ran = new Random(); //Crée un nombre aléatoire
	}

	@Override
	//Ici la fonction choisirCarte retourne une carte choisie aléatoirement dans le paquet
	public Carte choisirCarte() {
		return this.p.getCarte(ran.nextInt(this.p.getNombreCarte()));
	}
}