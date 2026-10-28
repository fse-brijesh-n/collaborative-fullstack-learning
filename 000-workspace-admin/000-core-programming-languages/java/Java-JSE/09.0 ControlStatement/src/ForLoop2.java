
public class ForLoop2{

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		 int sum=0;
		for(int i=1; i<=n; i++) {
			sum+=i;
			if(i==n)
				System.out.print(i);
			else
				System.out.print(i+"+");
		}
		System.out.println("="+sum);
			
		sc.close();
	}
	
	 
}

