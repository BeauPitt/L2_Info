/*
* Classe Page (d'agenda)
*/

import java.util.*;
import java.lang.*;


class Page{
	private int identif;
	private Jour[] jour;
	public Page(int id, Jour[] j) {
		identif = id;
		jour = j;
	}
}