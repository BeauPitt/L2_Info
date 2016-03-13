/*
* Classe Principale : TP Noté de SDD Agenda
* Lylian BLAUD - Loris CROCE
*/

import java.util.*;


class Main {
	public static void main(String args[]) {
		int NJour = 7;
		Jour[] j = new Jour[7];
		j[0] = new Jour("Lundi");
		j[1] = new Jour("Mardi");
		j[2] = new Jour("Mercredi");
		j[3] = new Jour("Jeudi");
		j[4] = new Jour("Vendredi");
		j[5] = new Jour("Samedi");
		j[6] = new Jour("Dimanche");
		
		for(int i = 0; i<7; i++){
			j[i].SetHeure();
		}
		
		System.out.println("blabla");
	}
}