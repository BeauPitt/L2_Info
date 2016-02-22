public class Date {

	/* attributs */

	final private int annee;
	final private int mois;
	final private int jour;

	/* les methodes */

	// constructeur 
	public Date() {
		jour = 8;
		mois = 2;
		annee = 1986;
	}

	// constructeur
	public Date(int j, int m, int a) {
		if (1 <= j && j <= 31) {
			jour = j; // this.jour = j;
		}
		else {
			throw new IllegalArgumentException();
		}
		if (1 <= m && m <= 12) {
			mois = m;
		}
		else {
			throw new IllegalArgumentException();
		}
		annee = a;
	}

	// afficher

	public String Afficher() {
		return("jour : "+jour+"\nmois : "+mois+"\nannee : "+annee);
	}

	// Comparer 

	public int Comparer(Date d1) {
		// 1 :this > d1, -1 :this < d1, 0 :this = d1 
		if (this.annee >d1.annee) {
			return 1;
		}
		else if (this.annee <d1.annee) {
			return -1;
		}
		else {
			if (this.mois > d1.mois) {
				return 1;
			}
			else if (this.mois < d1.mois) {
				return -1;
			}
			else {
				if (this.jour > d1.jour) {
					return 1;
				}
				else if (this.jour < d1.jour) {
					return -1;
				}
				else {
					return 0;
				}
			}
		}
	}

}