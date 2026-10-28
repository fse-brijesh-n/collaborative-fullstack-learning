package exceptional_handling.nested;
public class ExceptionHandlingEx3 {

	public static void main(String[] args) {
		System.out.println("Hello");
		int a=12,b=0,r=0;
		try {
			r=a/b;
			System.out.println("Division: "+r);
			System.out.println("Hi");
			int x[]= {5,2,8,6,9,98};
			try {
				System.out.println(x[r]);
			}catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("Index is out of Boundary");
			}
		}catch (ArithmeticException ae) {
			System.out.println("No. can not divide by Zero");
			try {
				System.out.println(9/0);
			}catch (ArithmeticException e) {
				System.out.println("No. can not divide by Zero");
			}
		}
		System.out.println("Bye");
	}

}