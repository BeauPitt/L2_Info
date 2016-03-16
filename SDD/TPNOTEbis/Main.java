/*
* Classe Principale : TP Noté de SDD Agenda
* Lylian BLAUD - Loris CROCE
*/

import java.util.Scanner; 
import java.io.*;

class Main {
	public static void main(String args[]) {
		
		// // test 1 :
		// Heure test1 = new Heure(15, "Poney");
		// System.out.println(test1);

		// // test 2 : 
		// Heure test2 = new Heure(4, " ");
		// System.out.println(test2);

		// // test 3 : 
		// Jour test3 = new Jour(1);
		// System.out.println(test3);

		 // test 4 :
		Page pageTest = new Page(4);

		pageTest.affichage();
	}
}