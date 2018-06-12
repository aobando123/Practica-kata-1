package ac.cr.ucenfotec.kata.cesar;

public class Cesar {

	public String cifrarCesar(String str, int codigo) {
		str = str.toLowerCase();
		StringBuilder cifrado = new StringBuilder();
		codigo = codigo % 26;
		if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
			if ((str.charAt(0) + codigo) > 'z') {
				cifrado.append((char) (str.charAt(0) + codigo - 26));
			} else {
				cifrado.append((char) (str.charAt(0) + codigo));
			}
		} 
		
		return cifrado.toString();

	}
}
