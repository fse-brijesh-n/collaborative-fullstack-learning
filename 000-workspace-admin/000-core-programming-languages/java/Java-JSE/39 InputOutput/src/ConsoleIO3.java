import java.util.Scanner;

public class ConsoleIO3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
//		String a=sc.nextLine();
		String a=sc.next();
		System.out.println("Entered String: "+a);
		sc.close();
	}

}