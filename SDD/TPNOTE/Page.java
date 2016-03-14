/*
* Classe Page (d'agenda)
*/

class Page{

	int identif;
	Jour jour0;
	Jour jour1;
	Jour jour2;
	Jour jour3;
	Jour jour4;
	Jour jour5;
	Jour jour6;
	
	public Page(int id, Jour j0, Jour j1,Jour j2,Jour j3,Jour j4,Jour j5,Jour j6) {
		this.identif = id;
		this.jour0 = j0;
		this.jour1 = j1;
		this.jour2 = j2;
		this.jour3 = j3;
		this.jour4 = j4;
		this.jour5 = j5;
		this.jour6 = j6;
	}
	
	public int getID() {
		return identif;
	}
}