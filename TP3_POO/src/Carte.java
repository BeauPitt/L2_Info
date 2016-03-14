class Carte {

	private final int couleur;
	private final int valeur; // 2 = 2; As = 14;

	public Carte(int v, int c) {
		couleur = c;
		valeur = v;
	}

	public int getCouleur() {
		return this.couleur;
	}
 	
 	public int getValeur() {
 		return this.valeur;
 	}

	public int compare(Carte c) {
		if (this.valeur < c.valeur) {
			return -1;
		}
		else if (this.valeur > c.valeur) {
			return 1;
		} else return 0;
	}

	@Override
	public String toString() {
		return " "+couleur +" " + valeur;
	}
}