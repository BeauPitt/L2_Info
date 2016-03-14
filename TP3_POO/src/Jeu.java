class Jeu {
	Paquet paquet;
	
	private Joueur jouerCoup() {

	}

	private void creerNouveauPaquet() {

	}

	private void distribuerPaquet(Joueur j1, Joueur j2) {
		j1.nouveauJeu();
		j2.nouveauJeu();
		while(paquet.getNombreCarte() >=2) {
			Carte c1 = paquet.retirerCarte(0);
			Carte c2 = paquet.retirerCarte(0);
			j1.recupererCarte(c1);
			j2.recupererCarte(c2);
		}
	}

	private void jouerPartie() {

	}

}