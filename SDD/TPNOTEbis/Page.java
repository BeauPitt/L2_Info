/*
* Classe Page (d'agenda)
*/

class Page {
	public static final int NB_JOUR = 7;
	int identif;
	Jour jours[] = new Jour[NB_JOUR];
	public Page(int id) {
		if (id < 52) {
			identif = id;
			for(int j=0; j<7; j++){
				jours[j] = new Jour(j);
			}
		} else throw new IllegalArgumentException();
	}

	
	public int getID() {
		return identif;
	}

	// du boulot pour le toString.. si affichage d'une page

	public String toString() {
		return "Semaine "+identif;
	}

	public void affichage() {
		for (int i = 0; i < NB_JOUR; i++) {
			System.out.print("  "+ jours[i].toString());	
		}
	}
}