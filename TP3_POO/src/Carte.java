class Carte {

	private final int valeur; // 2 = 2; As = 14;

	public Carte(int v) {
		valeur = v;
	}
 	
 	public int getValeur() {
 		return this.valeur;
 	}

	public int compare(Carte c) {
		if (this.valeur < c.valeur) {
			return -1;
		}
		else if (this.valeur > c.valeur) {
			return 1;
		} else return 0;
	}

	@Override
	public String toString() {
		String tmp = "Erreur carte";
		switch (valeur) {
			case 2 : 
			{
				tmp = "deux";
				break;
			}
			case 3 : 
			{
				tmp = "trois";
				break;
			}
			case 4 : 
			{
				tmp = "quatre";
				break;
			}
			case 5 : 
			{
				tmp = "cinq";
				break;
			}
			case 6 : 
			{
				tmp = "six";
				break;
			}
			case 7 : 
			{
				tmp = "sept";
				break;
			}
			case 8 : 
			{
				tmp = "huit";
				break;
			}
			case 9 : 
			{
				tmp = "neuf";
				break;
			}
			case 10 : 
			{
				tmp = "dix";
				break;
			}
			case 11 : 
			{
				tmp = "valet";
				break;
			}
			case 12 : 
			{
				tmp = "dame";
				break;
			}
			case 13 : 
			{
				tmp = "roi";
				break;
			}
			case 14 : 
			{
				tmp = "as";
				break;
			}
		}
		return tmp;
	}
}