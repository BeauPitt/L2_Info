package tp4;

class Matrice {
	// Attributs
	int nbLgn;
	int nbCol;
	int diag;
	int[][] mat;

	// Constructeurs
	public Matrice(int tL, int tC) {
			mat = new int[tL][tC];
			nbCol = tC;
			nbLgn = tL;
			for (int i = 0; i < this.nbLgn; i++) {			
				for (int j = 0; j < this.nbCol; j++) {
					mat[i][j] = i+j;
				}
			}
	}

	// triangulaire
	public Matrice(int diagonale) {
		diag = diagonale;
		int lignes = diag;
		for (int i = lignes; i >=0; i--) {			
				for (int j = 0; j<diag; j++) {
					mat = new int[i][j];
				}
				diag -= 1;
			}
	}

	public Matrice ajouter(Matrice m) {
		Matrice r = new Matrice(m.nbLgn, m.nbCol);
		if (this.nbLgn == m.nbLgn && this.nbCol == m.nbCol) {
			for (int i = 0; i < this.nbLgn; i++) {
				for (int j = 0; j < this.nbCol; j++) {
					r.mat[i][j] = this.mat[i][j] + m.mat[i][j];
				}
			}
		}
		return r;
	}

	public void afficher() { 
			for (int i = 0; i < this.nbLgn; i++) {			
					for (int j = 0; j < this.nbCol; j++) {
						System.out.print(this.mat[i][j] + " ");
					}
					System.out.println("");
			}
	}
}