class NombreA2Chiffres {
	private int chiffre1; // dixaines
	private int chiffre2; // unités

	public NombreA2Chiffres(int c1, int c2) {
		chiffre1 = c1;
		chiffre2 = c2;
	}

	// public int Nbr2c(int n1, int n2) {
	// 	int x = 10 * n1 + 1 * n2;
	// 	return x;
	// }



	@Override
	public String toString() {
		return "" + chiffre1 + "" + chiffre2;
	}
}