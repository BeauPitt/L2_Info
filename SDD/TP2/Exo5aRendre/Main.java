/*
* à rendre le 26 avril avant minuit - chapelle.quentin@gmail.com
* TP NOTÉ - Lylian BLAUD / Loris CROCE
* Penser à gérer les exceptions et un menu fonctionnel
* on entre un variable de x, on rentre le polynome et
* le programme permet de resoudre l'equation etc.
* forme x = 5 | y = 5x-4(2-x)*x^5
*/

 class Main {

  public static void main(String[] args) {
    Element elem = new Element('-');
    System.out.println(elem);
    Element elem2 = new Element(3);
    System.out.println(elem2);

    Polynome pol = new Polynome("5+4");
    System.out.println(pol);

  }

}
