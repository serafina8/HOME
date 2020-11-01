package conversion.String_to_Integer;

public class Integer_parseInt_String {
	public static void main(String[] args) 
	{
		String str = "10";
		
		int num1 = Integer.parseInt(str);
		System.out.println("Integer using first variant of"
				+ "parseInt = " + num1);
		
		int num2 = Integer.parseInt(str, 16);
		System.out.println("Integer using second(radix) "
				+ "variant of parseInt = " + num2);
		

	}

}
