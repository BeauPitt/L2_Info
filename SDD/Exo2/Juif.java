	class Juif {
	
	// attributs
	private boolean vivant;
	private int identif;
	private Juif precedent;
	private Juif suivant;

	// constructeur
	public Juif(int id, Juif prec, Juif suiv) {
		identif = id;
		precedent = prec;
		suivant = suiv;
	}

	// getters
	public Juif getPrecedent() {
		return precedent;
	}

	public Juif getSuivant() {
		return suivant;
	}

	// setters
	public void setSuivant(Juif j) {
		suivant = j;
	}

	public void setPrecedent(Juif j) {
		precedent = j;
	}

}
