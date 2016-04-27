import java.util.Hashtable;

class Banque {
	private static int plafond = 10000;
	private Hashtable <Integer, String> th1;
	private Hashtable <Integer, Integer> th2;

	public Banque() {
		th1 = new Hashtable <Integer, String> ();
		th2 = new Hashtable <Integer, Integer> ();
		th1.put(1, "jean");
		th1.put(2, "ouioui");
		th1.put(3, "Non");
		th2.put(1,3000);
		th2.put(2,1000);
		th2.put(3,400);
	}

	public void crediterCompte(int compte, int somme) {
		try {
			th1.containsValue(compte);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
		}

		th2.put(compte, th2.get(compte) + somme);
	}

	public void debiterCompte(int compte, int somme) {
		try {
			th1.containsValue(compte);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
		}

		th2.put(compte,th2.get(compte) - somme);
	}

	public String proprio(int compte) {
		try {
			th1.containsValue(compte);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
		}

		return th1.get(compte);
	}


	public void virement(int compte, int compte2, int somme) {
		try{
			th1.containsValue(compte);
			th2.containsValue(compte2);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
		}

		th2.put(compte, th2.get(compte) - somme);
		th2.put(compte2, th2.get(compte2) + somme);
	}
}