import java.io.*;

class Main {
	public static void main(String[] args) {

		/* Exercice 1 :
		
		Dog medor = new Dog("Medor");
		Animal felix = new Cat("Felix");

		// La methode toString appellÃ©e pour medor est celle de Dog car medor est dÃ©clarÃ© en tant que tel
		System.out.println(medor);
		// La mÃ©thode toString appellÃ©e pour felx est celle de Cat car mÃªme si il est dÃ©clarÃ© en tant qu'Animal
		// il est instanciÃ© en tant que Cat qui hÃ©rite d'Animal. Pour afficher la mÃ©thode toString d'Animal 
		// il aurait Ã©crire : Animal felix = new Animal("Felix");
		System.out.println(felix); 

		medor.Woof(); // Medor aboie
		// felix.Meow(); // Felix ne miaule pas, car il est de type Animal
		((Cat)felix).Meow(); // On utilise un 'cast' (du transtypage) pour faire miauler felix.
		// C'est Ã  dire que l'on change son type

		// medor.Meow(); // Il est impossible de faire miaule rmedor car la methode Meow appartient Ã  Cat
		// et medor est de type Dog.

		*/

		/* Exercice 2 */

		Mot mot = new Mot(); // On crée un nouveau mot 
		//System.out.println(mot);
		
		//System.out.println(mot.afficheVoyelles());
		//System.out.println(mot.estPalindrome());	
		//String motContenu = "oui"; //mot de test
		//System.out.println(mot.estContenu(motContenu));
		
	}
}