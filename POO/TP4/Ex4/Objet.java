class Objet {
	private int key;
	private int value;

	// Constructeur de l'objet lui ajoutant une clef et une valeur (ici des entiers)
	public Objet(int k, int v) {
		key = k;
		value = v;
	}

	// Getters
	public int getKey() {
		return this.key;
	}
	
	public int getValue() {
		return this.value;
	}
	
	// Fonction toString
	public String toString(){
		return "Objet : "+ this.key + "," + this.value;
	}
}