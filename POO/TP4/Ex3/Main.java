// package tp4;

import java.util.Random;

class Main {
	
	public static void main(String[] args) {

		// || Exercice 3 ||
		
        Hashmapp h = new Hashmapp();
        h.put(1,2);
        h.put(2,6);
        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue(6));
        System.out.println(h.get(2));
	}
}