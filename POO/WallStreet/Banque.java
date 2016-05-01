import java.util.Hashtable;

class Banque {
	private static int plafond = 10000;
	private Hashtable <Integer, String> th1;
	private Hashtable <Integer, Integer> th2;

	public Banque() {
		th1 = new Hashtable <Integer, String> ();
		th2 = new Hashtable <Integer, Integer> ();
		
		// Création des comptes
		th1.put(1, "jean");
		th1.put(2, "ouioui");
		th1.put(3, "Non");
		th2.put(1,3000);
		th2.put(2,1000);
		th2.put(3,400);
	}

	// Fonction qui crédite un compte
	// Cette fonction vérifie si le proprietaire du compte a un solde inferieur au plafond avant de lui ajouter
	public void crediterCompte(int compte, int somme) {
		try {
			th1.containsValue(compte);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
		}
		
		if( th2.get(compte) + somme < plafond) {
			th2.put(compte, th2.get(compte) + somme);
		}
		
	}

	//Fonction qui debite un compte
	// Elle verifie si le compte associé a un solde superieur a 0
	public void debiterCompte(int compte, int somme) {
		try {
			th1.containsValue(compte);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
		}
		
		if(th2.get(compte) - somme > 0) {
			th2.put(compte,th2.get(compte) - somme);
		}
		
	}

	// Retourne le nom du proprietaire du compte
	public String proprio(int compte) {
		try {
			th1.containsValue(compte);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
		}

		return th1.get(compte);
	}

	// Fait un virement entre deux compte
	public void virement(int compte, int compte2, int somme) {
		try{
			th1.containsValue(compte);
			th2.containsValue(compte2);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
		}
		
		if(th2.get(compte) - somme > 0 && th2.get(compte2) + somme < plafond) {
			th2.put(compte, th2.get(compte) - somme);
			th2.put(compte2, th2.get(compte2) + somme);
		}

	}
	
	// Affiche tout les comptes
	public void afficherCompte() {
		for(int i=1; i<=3; i++) {
			System.out.println("Compte de" + th1.get(i));
			System.out.println("Solde :" + th2.get(i));
		}
	}
}