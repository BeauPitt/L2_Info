// package tp4;

import java.util.Random;

class Main {
	
	public static void main(String[] args) {

		//  || Exercice 2 ||

		 Liste l = new Liste(0);
		 for (int i=1; i<10;i++) {
		 	l.add(i);
		 }
		 l.afficherListe();
		
		Element e = new Element(3, null, null);
		System.out.println(l.contains(e));
        l.afficherListe();
       	// l.reverse();  // Fonction reverse à revoir
        l.afficherListe();
		
	}
}