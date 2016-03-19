class Main {
	public static void main(String[] args) {
		// nombres de personnes
		int n = 40;

		// on cree le premier juif
		Juif init = new Juif(1, null, null);
		Juif cur = init;
		Juif tmp = null; // valeur temporaire

		for (int i = 2; i <= n; i++) {
			tmp = new Juif(i, cur, null);
			cur.setSuivant(tmp);
			cur = tmp;
		}
		init.setPrecedent(tmp);
		cur.setSuivant(init);

		int compt = 40;
		while(compt!=1){
			for (int i=0;i<7;i++) {
				
			}
		}
	}
}