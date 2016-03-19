class Noeud {

	// attributs
	private int valeur;
	private char operand;
	private Noeud pere;
	private Noeud filsGauche;
	private Noeud filsDroit;

	// constructeurs 
	// feuille 
	public Noeud(int v) {
		valeur = v;
		operand = null;
	}

	// branche
	public Noeud(char op) {
		valeur = null;
		operand = op;
	}

	// setters
	public void setPere(Noeud p) {
		p = pere;
	}

	public void setFilsG(Noeud fg) {
		filsGauche = fg;
	}

	public void setFilsD(Noeud fd) {
		filsDroite = fd;
	}

	// getters
	public Noeud getPere() {
		return pere;
	}

	public Noeud getFilsG() {
		return filsGauche;
	}

	public Noeud getFilsD() {
		return filsDroite;
	}

	public int getValeur() {
		return valeur;
	}

	public char getOperand() {
		return operand;
	}
}