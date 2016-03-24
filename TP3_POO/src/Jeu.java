class Jeu {
	private static Paquet p;
	
	// Méthode main
	public static void main (String[] args) {
		Ordinateur J1 = new Ordinateur("Jean (J1)");
		Ordinateur J2 = new Ordinateur("Michel (J2)");
		creerNouveauPaquet();
		distribuerPaquet(J1, J2);
		jouerPartie(J1,J2);
	}
	
	// Crée le paquet et le mélange
	private static void creerNouveauPaquet() {
		p = new Paquet();
		for (int j=0; j<=3; j++) {
			for (int i=2; i<15; i++) {
				Carte c = new Carte(i);
				p.ajouterCarte(c);
			}
		}
		p.melanger();
	}

	// Distribue le paquet aux deux joueurs
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

	// La méthode jouerPartie lance la partie entre les deux joueurs
	private static void jouerPartie(Joueur J1, Joueur J2) {
		Carte c1;
		Carte c2;
		Carte c3;
		Carte c4;
		int compt = 0;
		// Tant qu'il reste des cartes dans les deux paquet la partie continue
		while (J1.aPerdu()==false && J2.aPerdu()==false) {
			// Affiche chaque tout les cartes dans le paquet de chaque joueurs
			System.out.println("tour n°" + compt);
			System.out.println(J1);
			System.out.println(J2);
			System.out.println(" ");
			c1 = J1.jouer();
			c2 = J2.jouer();
			// Compare la valeur des cartes et redonnes toutes les cartes au gagnant
			if(c1.compare(c2) == -1) {
				J2.recupererCarte(c2);
				J2.recupererCarte(c1);
				compt++;
			} else if (c1.compare(c2) == 1) {
				J1.recupererCarte(c1);
				J1.recupererCarte(c2);
				compt++;
			} else {
				c3 = J1.jouer();
				c4 = J2.jouer();
				if (c3.compare(c4) == -1) {
					J2.recupererCarte(c2);
					J2.recupererCarte(c1);
					J2.recupererCarte(c3);
					J2.recupererCarte(c4);
					compt++;
				} else if (c3.compare(c4) == 1) {
					J1.recupererCarte(c1);
					J1.recupererCarte(c2);
					J1.recupererCarte(c3);
					J1.recupererCarte(c4);
					compt++;
				}
			}
		}
		if (J1.aPerdu() == true) {
			System.out.println("J2 WIN");
		}else if (J2.aPerdu() == true) {
			System.out.println("J1 WIN");
		}
	}
}