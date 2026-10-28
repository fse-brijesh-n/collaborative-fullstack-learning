public class WhileLoopEx2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		while(n!=0) {
			int r=n%10;
			System.out.print(r);
			n/=10;
		}
		
		sc.close();
	}
}
