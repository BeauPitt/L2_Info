class Jeu {
	static Paquet p;
	
	public static void main (String[] args) {
		Ordinateur J1 = new Ordinateur("Connard1");
		Ordinateur J2 = new Ordinateur("Connard2");
		creerNouveauPaquet();
		distribuerPaquet(J1, J2);
		jouerPartie(J1,J2);
		}
	

	private static void creerNouveauPaquet() {
		p = new Paquet();
		for(int j=0; j<5; j++){
			for(int i=2; i<15; i++){
				Carte c = new Carte(i);
				p.ajouterCarte(c);
			}
		}
	}

	private static void distribuerPaquet(Joueur j1, Joueur j2) {
		j1.nouveauJeu();
		j2.nouveauJeu();
		while(p.getNombreCarte() >=2) {
			Carte c1 = p.retirerCarte(0);
			Carte c2 = p.retirerCarte(0);
			j1.recupererCarte(c1);
			j2.recupererCarte(c2);
		}
	}

	private static void jouerPartie(Joueur J1, Joueur J2) {
		Carte c1;
		Carte c2;
		while (J1.aPerdu()==false || J2.aPerdu()==false) {
			System.out.println(J1);
			System.out.println(J2);
			c1 = J1.jouer();
			c2 = J2.jouer();
			if(c1.compare(c2) == -1) {
				J2.recupererCarte(c1);
				J2.recupererCarte(c2);
			}else if(c1.compare(c2) == 1) {
				J1.recupererCarte(c2);
				J1.recupererCarte(c1);
			}
		}
		if(J1.aPerdu() == true){
			System.out.println("J2 WIN");
		}else if(J2.aPerdu() == true){
			System.out.println("J1 WIN");
		}
	}
}