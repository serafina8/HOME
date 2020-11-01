package conversion.withSpecialRadix;

import java.text.DecimalFormat;

public class Binary {

	public static void main(String[] args) {
		int h = 255;
		String binaryString = Integer.toBinaryString(h);
		System.out.println(binaryString);
		//System.out.println(new DecimalFormat("#,###").format(h));
		
	}
}
