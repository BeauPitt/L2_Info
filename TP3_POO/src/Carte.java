class Carte {

	private final String couleur;
	private final int valeur; // 2 = 2; As = 14;

	public Carte(int v, String c) {
		couleur = c;
		valeur = v;
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

	}
}