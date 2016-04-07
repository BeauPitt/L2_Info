
public class HashEleve {
	
	private int nombreEleve;
	private Hashmapp h;
	
	// Constructeur
	public HashEleve(int taille) {
		nombreEleve = taille;
	}
	
	// Methode qui remplit la Hashtable avec le nombre souhaite d'eleve
	public void remplirHash() {
		h = new Hashmapp();
		for(int i = 0; i<nombreEleve; i++){
			h.put(i, (int)(Math.random()*(20 + 1)));
		}
	}
	
	// Recupere la valeur pour la clef i
	public int get(int i) {
		return h.getValue(i);
	}
	
	// Retourne la taille de la Hashtable
	public int size() {
		return h.getSize();
	}
}
