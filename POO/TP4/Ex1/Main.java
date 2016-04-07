// package tp4;

import java.util.Random;

class Main {
	
	public static void main(String[] args) {
		
		// || Exercice 1 ||
		System.out.println("Matrice m :");
		Matrice m = new Matrice(3,3);
		m.afficher();
		System.out.println("Matrice n :");
		Matrice n = new Matrice(3,3);
		m.afficher();
		System.out.println("Matrice m + Matrice n :");
		Matrice o = m.ajouter(n);
		o.afficher();
		Matrice t = new Matrice(4);
		
	}
}