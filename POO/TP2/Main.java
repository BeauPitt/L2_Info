import java.io.*;

class Main {
	public static void main(String[] args) {

		/* Exercice 1 :
		
		Dog medor = new Dog("Medor");
		Animal felix = new Cat("Felix");

		// La methode toString appellée pour medor est celle de Dog car medor est déclaré en tant que tel
		System.out.println(medor);
		// La méthode toString appellée pour felx est celle de Cat car même si il est déclaré en tant qu'Animal
		// il est instancié en tant que Cat qui hérite d'Animal. Pour afficher la méthode toString d'Animal 
		// il aurait écrire : Animal felix = new Animal("Felix");
		System.out.println(felix); 

		medor.Woof(); // Medor aboie
		// felix.Meow(); // Felix ne miaule pas, car il est de type Animal
		((Cat)felix).Meow(); // On utilise un 'cast' (du transtypage) pour faire miauler felix.
		// C'est à dire que l'on change son type

		// medor.Meow(); // Il est impossible de faire miaule rmedor car la methode Meow appartient à Cat
		// et medor est de type Dog.

		*/

		Mot mot = new Mot(); // On crée un nouveau mot 
		//System.out.println(mot);
		
		//System.out.println(mot.afficheVoyelles());
		//System.out.println(mot.estPalindrome());	
		String motContenu = "oui";
		System.out.println(mot.estContenu(motContenu));
	}
}