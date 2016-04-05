// package tp4;


class Main {
	
	public static void main(String[] args) {
		
		// Question 1.
		
		long temps1;
		long temps2;
		long tempsFinal;
		int n = 1900000; // On r�p�te n fois l'ajout pour que le temps de cr�ation soit long
		
		// On cr�e les diff�rentes structures
		// Nous partons du principe que les num�ro �tudiants commencent de 0 jusqu'� 100.
		TableauEleve tab = new TableauEleve(100);
		ListeEleve liste = new ListeEleve(100);
		HashEleve hash = new HashEleve(100);
		
		
		// Nous remplissons le tableau n fois et calculons le temps
		temps1 = System.currentTimeMillis();
		for(int j = 0; j<n; j++){
			tab.remplirTableau();
		}
		temps2 = System.currentTimeMillis();
		tempsFinal = temps2-temps1;
		System.out.println("Temps de cr�ation du tableau (en Milliseconde) : " + tempsFinal);
		
		// Nous remplissons la liste n fois et calculons le temps
		temps1 = System.currentTimeMillis();
		for(int j = 0; j<n; j++){
			liste.remplirListe();
		}
		temps2 = System.currentTimeMillis();
		tempsFinal = temps2-temps1;
		System.out.println("Temps de cr�ation de la Liste (en Milliseconde) : " + tempsFinal);
		
		// Nous remplissons la Hashtable n fois et calculons le temps
		temps1 = System.currentTimeMillis();
		for(int j = 0; j<n; j++){
			hash.remplirHash();
		}
		temps2 = System.currentTimeMillis();
		tempsFinal = temps2-temps1;
		System.out.println("Temps de cr�ation du Hashtable (en Milliseconde) : " + tempsFinal);
		
		// Question2.
		// Utilisation de la m�thode moyenne pour chaque structure.
		System.out.println("");
		System.out.println("Moyenne du tableau : " + moyenne(tab));
		System.out.println("Moyenne de la liste : " + moyenne(liste));
		System.out.println("Moyenne de la Hashtable : " + moyenne(hash));
		
	}
	
	// M�thodes des calcul de moyenne.
	public static int moyenne(TableauEleve tab) {
		int result = 0;
		for(int i=0; i<tab.size();i++){
			result +=tab.get(i);
		}
		return result/tab.size();
	}
	
	public static int moyenne(ListeEleve l) {
		int result = 0;
		for(int i =0; i<=l.size(); i++) {
			result += l.get(i);
		}
		return result/l.size();
	}
	
	public static int moyenne(HashEleve h) {
		int result =0;
		for(int i=0; i<h.size();i++){
			result += h.get(i);
		}
		return result/h.size();
	}
}