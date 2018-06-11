package ac.cr.ucenfotec.kata.foobarqix;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {
	
	static HashMap<Integer, String> checkNumber =  new HashMap<Integer, String>();
	public void init() {
		checkNumber.put(3, "FOO");
		checkNumber.put(5, "BAR");
		checkNumber.put(7, "QIX");
		
	}

	
	public String createFoo (int num) {
		init();
		String word = "";
		for(Map.Entry<Integer, String> row : checkNumber.entrySet()) {

			if(num % row.getKey()== 0) {
				if(!word.isEmpty()) {
					word += "-";
				}
				word += row.getValue();
			}
		}

		return word;
	}


}
