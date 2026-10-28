public class StringConversionEx {

	public static void main(String[] args) {
		//Primitive to String Conversion
		
		int x=12;
		//String a=x;//error
		String a=String.valueOf(x);
		System.out.println(a);
		double y=2.6;
		String b=String.valueOf(y);
		System.out.println(b);
	}

}