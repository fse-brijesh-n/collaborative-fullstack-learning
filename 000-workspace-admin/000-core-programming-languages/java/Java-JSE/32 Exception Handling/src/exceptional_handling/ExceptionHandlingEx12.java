package exceptional_handling;
public class ExceptionHandlingEx12 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int r=7/0;
			System.out.println("Division: "+r);
//		}catch (ArithmeticException ae) {
		}catch (NullPointerException ae) {	
			System.out.println("Hi");
		}finally {
			System.out.println("INCAPP");
		}
		System.out.println("Bye");
	}

}