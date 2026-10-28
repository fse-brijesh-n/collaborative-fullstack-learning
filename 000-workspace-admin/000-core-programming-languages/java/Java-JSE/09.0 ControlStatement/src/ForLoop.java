
public class ForLoop{

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		 int fact=1;
		for(int i=1; i<=n; i++) {
			fact*=i;
			if(i==n)
				System.out.print(i);
			else
				System.out.print(i+"*");
		}
		System.out.println("="+fact);
			sc.close();
	}
	
	 
}


