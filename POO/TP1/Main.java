public class Main {

	// Méthode Principale

	public static void main (String[] args) {

		// Création de dates

		Date d1 = new Date();
		Date d2 = new Date(7, 2, 1985);
		Date d3 = new Date(7, 2, 2000);

		// Affichage

		String ch = d2.Afficher();
		System.out.println(ch);

		// Création de personnes

		Personne p = new Personne("bob", "michel", true, false, d2);
		Personne p1 = new Personne("bobby", "michelle", false, false, d1);
		Personne p2 = new Personne("jean", "dupont", false, d2, p, p1);
		Personne p3 = new Personne("jeanne","dupond", false, d1, p, p1);

		// Appels des méthodes

		p2.MemeParents(p3);
		p.Mariage(p1, d3);
	}
}