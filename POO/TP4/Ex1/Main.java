// package tp4;

import java.util.Random;

class Main {
	
	public static void main(String[] args) {
		
		// || Exercice 1 ||

		Matrice m = new Matrice(2,2);
		m.afficher();
		Matrice n = new Matrice(2,2);
		m.afficher();
		Matrice o = m.ajouter(n);
		o.afficher();
		
	}
}