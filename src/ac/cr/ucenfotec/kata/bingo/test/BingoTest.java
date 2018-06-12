package ac.cr.ucenfotec.kata.bingo.test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.kata.bingo.Bingo;

public class BingoTest {
	static Bingo bingo;

	@BeforeClass
	public static void init() {
		bingo =  new Bingo();
		
	}
	
	@Test
	public void generarNumDiferentesDel1al10() {
		int num1 = bingo.crearNumero(1, 9);
		int num2 = bingo.crearNumero(1, 9);
		
		assertNotEquals(num1, num2);
	}
	
	@Test
	public void generarCartonBingo() {
		int[][] nuevoCarton =  bingo.crearCarton();
		boolean isFilled = true;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < nuevoCarton.length; j++) {
				if(nuevoCarton[j][i] <= 0 || nuevoCarton[j][i] > 90) {
					isFilled = false;
				};
			}
		}
		
		
		assertTrue(isFilled);
	}
	@Test
	public void generarCartonBingoconNumDiferentes() {
		int[][] nuevoCarton =  bingo.crearCarton();
		HashSet<Integer> listNum = new HashSet<Integer>();
		boolean isFilled = true;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < nuevoCarton.length; j++) {
				if(! listNum.add(nuevoCarton[j][i])) {
					isFilled = false;
				};
			}
		}
		
		assertTrue(isFilled);
	}
}
