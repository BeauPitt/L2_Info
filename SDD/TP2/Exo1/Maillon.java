class Maillon {
	
	private Maillon elementPrecedent;
	private int valeur;
	
	public Maillon(int val, Maillon precedent) {
		valeur = val;
		elementPrecedent = precedent;
	}

	public int getVal() {
		return valeur;
	}

	public int getPrec() {
		return elementPrecedent;
	}
}