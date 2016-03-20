import java.util.*;

class Ordinateur extends Joueur {
	Random ran;
	
	public Ordinateur(String nom) {
		super(nom);
		ran = new Random(); //Cr�e un nombre al�atoire
	}

	@Override
	//Ici la fonction choisirCarte retourne une carte choisie al�atoirement dans le paquet
	public Carte choisirCarte() {
		return this.p.getCarte(ran.nextInt(this.p.getNombreCarte()));
	}
}