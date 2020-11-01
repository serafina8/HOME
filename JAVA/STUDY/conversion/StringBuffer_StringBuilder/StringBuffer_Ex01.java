package conversion.StringBuffer_StringBuilder;

public class StringBuffer_Ex01 {

	public static void main(String[] args) {
		int f = 1234;
		StringBuffer sb = new StringBuffer();
		sb.append(f);
		String str6 = sb.toString();
		System.out.println("String str6 = " + str6);
	}
}
