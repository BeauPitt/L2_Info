/*
* Classe Page (d'agenda)
*/

class Page {
	
	// attributs
	public static final int NB_JOUR = 7;
	int identif;
	Jour jours[] = new Jour[NB_JOUR];

	// constructeur
	public Page(int id) {
		if (id < 52) {
			identif = id;
			for(int j=0; j<NB_JOUR; j++){
				jours[j] = new Jour(j);
			}
		} else throw new IllegalArgumentException();
	}

	// getter
	public int getID() {
		return identif;
	}

	// toString
	@Override
	public String toString() {
		return "Semaine "+identif;
	}

	// Affichage d'une page de calendrier
	public void affichage() {
		// On affiche la semaine
		System.out.println("\n		>> "+this+ " <<\n");

		// On affiche les jours de la semaine
		for (int i = 0; i < NB_JOUR; i++) {
			System.out.print("	 "+ jours[i].toString()+"   ");	
		}
		System.out.print("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\n");

		// On affiche les heures
		for (int i = 0; i < Jour.NB_HEURE; i++) {
			System.out.print(jours[0].heures[i].toString());
			// On affiche les évenements
			for (int j = 0; j < NB_JOUR; j++) {
				System.out.print(jours[j].heures[i].event);
			}
			System.out.print(" \n\n");
		}
	}
}