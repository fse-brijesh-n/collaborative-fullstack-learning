
public class EvenOdd {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String choice;
		do {
		System.out.println("Enter a number to check even or odd");
		int n=sc.nextInt();
		boolean status=checkEvenOdd(n);
		System.out.println(status);
		System.out.println("Do you want to [yes/no] continue... ");
		choice=sc.next();
		if(choice.equalsIgnoreCase("no")) {
			break;
		}
	}while(choice.equalsIgnoreCase("yes"));

	}
	
	static boolean checkEvenOdd(int n) {
		boolean flag=false;
		if (n%2==0) {
			flag=true;
		}
		
		return flag;
	}
}
