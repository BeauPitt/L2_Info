import java.util.*;
/*
* mail prof : chapelle.quentin@gmail.com
*/

class TP1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nb à deux chiffres :");
		System.out.println("Donnez le premier chiffre :");
		int nb1 = sc.nextInt();
		if (nb1 >= 10) {
			System.out.println("reessayez avec un chiffre :");
			nb1 = sc.nextInt();		
		}
		else {
			System.out.println("Donnez le deuxieme chiffre :");
			int nb2 = sc.nextInt();
			if (nb2 >= 10) {
				System.out.println("reessayez avec un chiffre:");
				nb2 = sc.nextInt();					
			}
			else {
				NombreA2Chiffres nb2c = new NombreA2Chiffres(nb1, nb2);
				//System.out.println(nb2c);
				//int r = nb2c.Nbr2c(nb1, nb2);
				System.out.println(nb2c);
			}
		}
		// int a, b, c;
		// c = 6;
		// b = 6;
		// a = c * b;
		// a = a /10;
		// System.out.println(a);

	}
	public NombreA2Chiffres arith(int x, int y, boolean b) {
		int temp, a, z;
		NombreA2Chiffres na2c;
			temp = x * y;
			a = temp / 10;
			z = temp - a * 10;
			na2c = NombreA2Chiffres(a,z);
			return na2c;
	}


}