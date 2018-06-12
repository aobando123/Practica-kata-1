package ac.cr.ucenfotec.kata.cesar.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.kata.bingo.Bingo;
import ac.cr.ucenfotec.kata.cesar.Cesar;

public class CesarTest {
	
	static Cesar cesar;

	@BeforeClass
	public static void init() {
		cesar =  new Cesar();
		
	}

}
