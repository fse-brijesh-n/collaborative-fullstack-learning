package exceptional_handling;
public class ExceptionHandlingEx16 {

	public static void main(String[] args) {
		try {
			System.out.println("Hello");
			System.exit(0);
			int r=7/0;
			System.out.println("Division: "+r);
		//}catch (ArithmeticException ae) {	
		}catch (NullPointerException ae) {	
			System.out.println("Hi");
		}finally {
			System.out.println("INCAPP");
		}
		System.out.println("Bye");
	}

}
