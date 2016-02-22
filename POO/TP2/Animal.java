class Animal {
	protected final String nom;

	public Animal(String n) {
		nom = n;
	}

	@Override
	public String toString() {
		return "Je suis un animal qui s'appelle : "+nom+"";
	} 
}