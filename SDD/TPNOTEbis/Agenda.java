/*
* Classe Agenda
*/

class Agenda {


	// attributs
	private static final int NB_SEMAINES = 52;
	private int identif;
	private Page[] pages = new Page[NB_SEMAINES];

	// constructeur
	public Agenda(int id) {
		identif = id;
		for(int i = 0; i < NB_SEMAINES; i++){
			pages[i] = new Page(i);
		}
	}

	// getters
	public int getId() {
		return identif;
	}

	public Page getPage(int i) {
		return pages[i];
	}

}