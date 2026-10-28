public class FunctionExFactorial {
	static int findFactorial(int n) {
		int fact=1;
		for(int x=1;x<=n;x++) {
			fact *= x;
		}
		return fact;
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter a no.: ");
		int n=sc.nextInt();
		
		int reuslt=findFactorial(n);
		System.out.println("Factorial of "+n+" is "+reuslt);
	}
}
