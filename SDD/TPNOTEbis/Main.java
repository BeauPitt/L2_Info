/*
* Classe Principale : TP Note de SDD Agenda
* Lylian BLAUD - Loris CROCE
*/

import java.util.Scanner; 
import java.io.*;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in); // récuperation des evenements clavier
		Agenda agenda = new Agenda(2016); // on cree un agenda pour l'anneee courante

		System.out.println("Bonjour, bienvenue dans iAgenda™");
		System.out.println("Quelle page de l'agenda "+ agenda.getId() +" voulez-vous afficher ?");
		int pg = sc.nextInt();
		agenda.getPage(pg).affichage();
		System.out.println("Voulez-vous ajouter un evenement ?");
		System.out.println("O/N");
		String strNope = sc.nextLine(); // scanner "poubelle" pour que la saisie ait bien lieu..
		String str = sc.nextLine();
		// si oui on ajoute un evenement et on affiche l'agenda
		if (str.equals("O") || str.equals("o")) {
			agenda.getPage(pg).ajouterEvent(); 
			agenda.getPage(pg).affichage();

		}
		else System.exit(1); // quitte le programme
	}
}