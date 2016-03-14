import java.util.*;

class Ordinateur extends Joueur{
	Random ran;
	public Ordinateur() {
		this.super();
		ran = new Random();
	}

	public Carte choisirCarte(){
		return this.p.choisirCarte(ran.nextInt(this.p.getNombreCartes()+1));
	}
}