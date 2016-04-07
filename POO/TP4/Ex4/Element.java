// package tp4;

class Element {

	private int val;
	private Element suiv;
	private Element prec;

	// Constructeur de l'element
	public Element(int valeur,Element precedent, Element suivant) {
		val = valeur;
		suiv = suivant;
		prec = precedent;
	}

	// getters
	public Element getSuivant() {
		return suiv;
	}

	public Element getPrecedent() {
		return prec;
	}

	public int getValeur() {
		return val;
	}

	// setters
	public void setSuivant(Element j) {
		suiv = j;
	}

	public void setPrecedent(Element j) {
		suiv = j;
	}
	
}