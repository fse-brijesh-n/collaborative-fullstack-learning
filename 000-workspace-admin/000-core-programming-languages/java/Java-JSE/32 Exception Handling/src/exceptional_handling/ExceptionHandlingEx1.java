package exceptional_handling;
public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		int a=12,b=2,r=0;
		try {
			r=a/b;
			System.out.println("Division: "+r);
		}catch (ArithmeticException ae) {
			System.out.println("No Can not divide by 0");
		}
		System.out.println("Bye");
	}
}
