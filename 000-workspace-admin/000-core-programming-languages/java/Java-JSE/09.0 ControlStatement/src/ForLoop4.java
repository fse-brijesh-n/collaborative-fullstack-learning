

public class ForLoop4{

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=2; i<=n-1; i++) {
			
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Prime no");
		}
		else{
			System.out.println("Not a prime no");
		}
		
		sc.close();
	}
	
	 
}


