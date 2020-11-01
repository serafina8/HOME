package conversion.withSpecialRadix;

public class Octal {

	public static void main(String[] args) {
		int i = 255;
		String octalString = Integer.toOctalString(i);
		System.out.println(octalString);
	}
}
