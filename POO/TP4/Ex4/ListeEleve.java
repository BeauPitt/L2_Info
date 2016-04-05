
public class ListeEleve {
	
	private int nombreEleve;
	private Liste l;
	public ListeEleve(int taille) {
		nombreEleve = taille;
		
	}
	
	// Methode qui remplis la liste avec le nombre souhaité d'élève
	public void remplirListe() {
		l = new Liste((int)(Math.random()*(20 + 1)));
		for (int i=1; i<nombreEleve;i++) {
			l.add((int)(Math.random()*(20 + 1)));
		}
	}
	
	// Retourne la valeur en position i
	public int get(int i) {
		return l.getValue(i);
	}
	
	// Retourne la taille de la liste
	public int size() {
		return l.getSize();
	}
}
