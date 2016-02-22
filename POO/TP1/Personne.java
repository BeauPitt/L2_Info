public class Personne {

	// Attributs

	private String nom;
	private String prenom;
	private boolean statut;
	private Date dateNaissance;
	private Date dateMarriage;
	private Personne parent1;
	private Personne parent2;
	private boolean sexe; 		// Homme = true, Femme = False

	// Constructeurs

	public Personne(String n, String p, boolean sx, boolean s, Date dn) {
		nom = n;
		prenom = p;
		statut = s;
		dateNaissance = dn;
		sexe = sx;
	}

	public Personne(String n, String p, boolean s, Date dn, Date dm) {
		nom = n;
		prenom = p;
		statut = s;
		dateNaissance = dn;
		dateMarriage = dm;
		if (dn.Comparer(dm) < 1) {
			throw new IllegalArgumentException();
		}
	}

	public Personne(String n, String p, boolean s, Date dn, Personne par1, Personne par2) {
		nom = n;
		prenom = p;
		statut = s;
		dateNaissance = dn;
		parent1 = par1;
		parent2 = par2;
	}

	// Méthodes 

	public void Mariage(Personne p, Date m){
		if (this.statut == false && p.statut == false) {
			this.statut = true;
			p.statut = true;
			this.dateMarriage = m;
			p.dateMarriage = m;
			if(p.sexe== false){
				p.nom = this.nom; 
			} else if(this.sexe == false){
				this.nom = p.nom;
			}
		}
	}

	public int MemeParents(Personne p){
		if(this.parent1 == p.parent1 && this.parent2 == p.parent2) {
			return 1;
		}
		else {
			return 0;
		} 
	}

}