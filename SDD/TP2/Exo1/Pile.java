class Pile {

	private Maillon firstElem = null;

	public void empiler(int tab) {
		Maillon m = new Maillon(tab, firstElem);
		firstElem = m;
	}

	public int depiler() {
				
	}

	public int taille() {
		return 0;
	}
}