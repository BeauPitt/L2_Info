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
			for(int j=0; j<NB_JOUR; j++){
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
		// On affiche la semaine
		System.out.println("\n		"+this+ "\n");

		// On affiche les jours de la semaine
		for (int i = 0; i < NB_JOUR; i++) {
			System.out.print("	"+ jours[i].toString()+"   ");	
		}
		System.out.print("\n");

		// On affiche les heures
		for (int i = 0; i < Jour.NB_HEURE; i++) {
			System.out.print(jours[i].heures[i].toString());
			// On affiche les évenements
			for (int j = 0; j < NB_JOUR; j++) {
				System.out.print(" lol"+j+"		");
			}
			System.out.println();
		}
	}
}