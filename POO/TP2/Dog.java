class Dog extends Animal {

	public Dog(String n) {
		super(n);
	}

	@Override
	public String toString() {
		return "Je suis un chien qui s'appelle : "+nom+"";
	}

	public void Woof() {
		System.out.println("Woof !");
	}
}