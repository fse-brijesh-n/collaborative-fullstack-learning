
public class ScannerClass {

	public static void main(String[] args) {
		
		//Use of Scanner class in the program without importing
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//taking integers value from the keyboard
		System.out.println("Enter a integer number");
		int a=sc.nextInt();
		System.out.println("Enter a Floating number");
		double b=sc.nextDouble();
		System.out.println("Enter a string number");
		String c=sc.next();
		System.out.println("Entered values are:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();


	}

}
