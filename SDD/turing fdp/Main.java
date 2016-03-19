
public class Main {
	public static void main(String[] args) {
		
		int q = 2;
		char ruban[] = new char[6];
		for(int t = 0; t < 6 ; t++){
			ruban[t] = 'b';
		}
		ruban[0] = '1';
		ruban[1] = '0';
		ruban[2] = '0';
		ruban[3] = '0';
		Instruction[] i = new Instruction[13];
		
		//Multiplication par deux
		/*i[0] = new Instruction('b', 1, 2, 'b', true);
		i[1] = new Instruction('0', 2, 2, '0', true);
		i[2] = new Instruction('1', 2, 2, '1', true);
		i[3] = new Instruction('b', 2, 3, '0', true);
		i[4] = new Instruction('b', 3, 4, 'd', true);*/
		
		//Division par 4
		i[0] = new Instruction('1', 2, 2, '1', true); // je vais à la fin
		i[1] = new Instruction('0', 2, 2, '0', true);
		i[2] = new Instruction('b', 2, 3, 'b', false); // je suis à la fin
		i[3] = new Instruction('0', 3, 4, '0', false);
		i[4] = new Instruction('1', 3, 6, '1', true); // nombre pair ?
		i[5] = new Instruction('0', 4, 5, '0', true);
		i[6] = new Instruction('1', 4, 7, '1', true); 
		i[7] = new Instruction('b', 6, 8, 'F', true); // non issu de test pair
		i[8] = new Instruction('0', 7, 7, '0', true); // non div 4
		i[9] = new Instruction('b', 7, 8, 'F', true); 
		i[10] = new Instruction('0', 5, 5, '0', true); // oui div 4
		i[11] = new Instruction('b', 5, 8, 'V', true); 
		i[12] = new Instruction('b', 8, 9, 'd', true); // fin par d
		
		int tmp1;
		for (int curseur = 0; curseur < ruban.length; curseur ++){
			for (int j = 0; j < i.length; j++) {
				tmp1 = i[j].getN();
					if (i[j].getC() == ruban[curseur] && q == tmp1) {
						q = i[j].getN_();
						ruban[curseur]= i[j].getC_();
						if (i[j].getD() == false){
							curseur = curseur - 2;
						}
					}
			}	
		}
		for(int x=0;x<ruban.length;x++){
			System.out.println(ruban[x]);
		}
	}
}
