import java.util.*;

class Ordinateur extends Joueur{
	Random ran;
	
	public Ordinateur(String nom) {
		super(nom);
		ran = new Random();
	}

	public Carte choisirCarte() {
		System.out.println(ran.nextInt(this.p.getNombreCarte()+1));
		return this.p.getCarte(ran.nextInt(this.p.getNombreCarte()+1));
	}
}