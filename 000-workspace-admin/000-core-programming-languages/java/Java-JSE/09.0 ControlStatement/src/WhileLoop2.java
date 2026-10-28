

public class WhileLoop2{

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		while(n!=0) {
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
			count+=1;
		}
		System.out.println("\nNo of digit : "+count);
		 
		sc.close();
	}
	
	 
}


