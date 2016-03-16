/*
* Classe Jour
*/

class Jour {

	// attributs
	public static final int NB_HEURE = 11;
	int identif; // 0 : Lundi 1 : Mardi etc.
	Heure[] heures = new Heure[NB_HEURE];

	// constructeur
	public Jour(int id) {
		if (identif > -1 && identif < 7) {
			identif = id;
			for (int i = 0; i < NB_HEURE; i++) {
				heures[i] = new Heure(i+8, "");
			}
		} else throw new IllegalArgumentException();
	}

	// getter
	public int getId() {
		return identif;
	}

	// setter
	public void setId(int id) {
		identif = id;
	}

	// toString
	@Override
	public String toString() {
		String temp;
		switch (identif) {
			case 0 : temp = "Lundi";
				break;
			case 1 : temp = "Mardi";
				break;
			case 2 : temp = "Mercredi";
				break;
			case 3 : temp = "Jeudi";
				break;
			case 4 : temp = "Vendredi";
				break;
			case 5 : temp = "Samedi";
				break;
			case 6 : temp = "Dimanche";
				break;
			default : temp = "Erreur"; 
		}
		return temp;
	}

}
