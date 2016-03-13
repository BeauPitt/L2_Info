	class Juif {
	
	private boolean vivant; // ?
	private int identif;
	private Juif precedent;
	private Juif suivant;

	public Juif(int id, Juif prec, Juif suiv) {
		identif = id;
		precedent = prec;
		suivant = suiv;
	}

	public Juif getPrecedent() {
		return precedent;
	}

	public Juif getSuivant() {
		return suivant;
	}

	public void setSuivant(Juif j) {
		suivant = j;
	}

	public void setPrecedent(Juif j) {
		precedent = j;
	}

}
