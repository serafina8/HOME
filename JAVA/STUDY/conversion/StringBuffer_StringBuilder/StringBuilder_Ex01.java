package conversion.StringBuffer_StringBuilder;

public class StringBuilder_Ex01 {

	public static void main(String[] args) {
		int g = 1234;
		StringBuilder sb = new StringBuilder();
		sb.append(g);
		String str7 = sb.toString();
		System.out.println("String str7 = " + str7);
	}
}
