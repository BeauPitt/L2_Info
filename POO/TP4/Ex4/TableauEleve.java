
public class TableauEleve {
	
	private int nombreEtudiants;
	private int tableau[];
	
	// Constructeur qui stocke le nombre d'�l�ve � ajouter
	public TableauEleve(int nb){
		nombreEtudiants = nb;
		tableau = new int[nombreEtudiants];
	}
	
	// Remplissage du tableau
	public void remplirTableau(){
		for(int i = 0; i<nombreEtudiants; i++) {
			this.tableau[i] = (int)(Math.random()*(20 + 1));
		}
	}
	
	// Retourne un �l�ment ce pla�ant en i
	public int get(int i) {
		return this.tableau[i];
	}
	
	// Retourne la taille du tableau
	public int size(){
		return tableau.length;
	}
}
