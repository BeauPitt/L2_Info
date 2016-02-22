class Cat extends Animal {

	public Cat(String n) {
		super(n);
	}

	@Override
	public String toString() {
		return "Je suis un chat qui s'appelle : "+nom+"";
	} 

	public void Meow() {
		System.out.println("Meow !");

	}
}