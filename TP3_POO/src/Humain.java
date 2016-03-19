import java.util.Scanner;

public class Humain extends Joueur{
	private Scanner s;
	
	public Humain(String nom) {
		super(nom);
	}
	
	public Carte choisirCarte() {
		System.out.println("Choisir une carte");
		s = new Scanner(System.in);
		return p.getCarte(s.nextInt());
	}
}
