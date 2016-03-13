/*
* Classe Principale : TP Not√© de SDD Agenda
* Lylian BLAUD - Loris CROCE
*/

import java.util.Scanner; 
import java.io.*;
class Main {
	public static void main(String args[]) {
		Jour[] j = new Jour[7];
		j[0] = new Jour("Lundi");
		j[1] = new Jour("Mardi");
		j[2] = new Jour("Mercredi");
		j[3] = new Jour("Jeudi");
		j[4] = new Jour("Vendredi");
		j[5] = new Jour("Samedi");
		j[6] = new Jour("Dimanche");
		
		for(int i = 0; i < 7; i++){
			j[i].SetHeure();
		}
		
		Page P = new Page(1, j[0], j[1], j[2], j[3], j[4], j[5], j[6]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Modifier un ÈvËnement ? Y/N");
		String str = sc.nextLine();
		if(str.equals("Y") || str.equals("y")){
			System.out.println("Pour quel jour ?");
			System.out.println("0 : lundi");
			System.out.println("1 : mardi");
			System.out.println("2 : mercredi");
			System.out.println("3 : jeudi");
			System.out.println("4 : vendredi");
			System.out.println("5 : samedi");
			System.out.println("6 : dimanche");
			int JourJ = sc.nextInt();
			System.out.println("Quelle heure ? Entre 8 et 18h");
			int HeureH = sc.nextInt();
			System.out.println("Et enfin, quel ÈvËnement voulez vous ajouter ?");
			String EventE = sc.nextLine();
			j[JourJ].heure.put(HeureH, EventE);
			System.out.println(j[JourJ].heure.get(HeureH));
		}
	}
}