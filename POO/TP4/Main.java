package tp4;



class Main {
	public static void main(String[] args) {

		// Exercice 1

		/*Matrice m = new Matrice(2,2);
		Matrice n = new Matrice(2,2);
		Matrice o = m.ajouter(n);
		o.afficher();*/
		
		// Exercice 2

		Liste l = new Liste(0);
		for(int i=1; i<10;i++){
			l.add(i);
		}
		//Element e = new Element(3, null, null);
		//System.out.println(l.contains(e));
                // Return de la fonction contains qui déconne mais fonctionne
                l.afficherListe();
                l.reverse();
                l.afficherListe();
                
	}
}