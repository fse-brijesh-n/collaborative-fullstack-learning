public class ParsingEx {

	public static void main(String[] args) {
		//String to Primitive Parsing
		
		//int a="12";//error
		int a=Integer.parseInt("12");
		System.out.println(a);
		
		double b=Double.parseDouble("12.6");
		System.out.println(b);
		
		//int aa=Integer.parseInt("12.6");//NumberFormatException
		//int aa=Integer.parseInt("Rahul");//NumberFormatException
	}

}