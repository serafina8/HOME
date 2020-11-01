package conversion.withSpecialRadix;

public class CustomBase_Radix {

	public static void main(String[] args) {
		int k = 255;
		String customString = Integer.toString(k,7);
		System.out.println(customString);
	}
}
