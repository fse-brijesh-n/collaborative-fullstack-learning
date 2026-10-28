

public class WhileLoop{

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int c=0;
		for(int i=1; i<=n; i++) {
			
			if(n%i==0) {
				c++;
			}
		}
		
		if(c==2) {
			System.out.println("Prime no");
		}
		else{
			System.out.println("Not a prime no");
		}
		
		sc.close();
	}
	
	 
}


