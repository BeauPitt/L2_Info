/*
* Classe evenement
*/

class Event {

	// attributs
	private String nom;

	// constructeur
	public Event(String n) {
		nom = n;
	}

	// setter
	public void setNom(String n) {
		nom = n;
	}

	// getter
	public String getNom() {
		return nom;
	}

	// toString
	@Override
	public String toString() {
		return nom;
	}
	
}