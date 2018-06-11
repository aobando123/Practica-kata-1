package ac.cr.ucenfotec.kata.bingo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Bingo {

	static int[][] carton;
	Set<Integer> numerosLlamados = new HashSet<>();
	public int[][] crearCarton() {
		
		carton = new int[3][9];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < carton.length; j++) {
				carton[j][i] = crearNumero(1 + 9*i, 9 + 10*i);
			}
		}
		
		numerosLlamados.clear();
		return carton;
	}
	
	public int crearNumero(int min, int max ) {
		boolean isNumAdded = false;
		int newNum;
		do {
			
			newNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			isNumAdded =  numerosLlamados.add(newNum);
			
		}while(!isNumAdded);
		return newNum;
	}
	
	public int anunciarNumero () {
		return crearNumero (1, 90);
	}
	
	
}
