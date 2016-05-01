class Main {
	public static void main(String[] args) {
		Banque b = new Banque();
		b.afficherCompte();
		b.crediterCompte(1, 500);
		b.afficherCompte();
		b.debiterCompte(2, 1000);
		b.afficherCompte();
		b.virement(3, 2, 100);
		b.afficherCompte();
	}
}