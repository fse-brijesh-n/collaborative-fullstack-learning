
public class PrimeNo {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a number to check prime or not");
			int n=sc.nextInt();
			boolean status=checkPrimeNo(n);
			System.out.println(status);
			System.out.println("Do you want to [yes/no] continue... ");
			choice=sc.next();
			if(choice.equalsIgnoreCase("no")) {
				break;
			}
		}while(choice.equalsIgnoreCase("yes"));
		

	}
	
	static boolean checkPrimeNo(int n) {
		boolean flag=true;
		
		if(n>1) {
			for(int i=2; i<n; i++) {
				
				if(n%i==0) {
					
					flag=false;
					
				}
			}
			
			return flag;
			
		}else {
			System.out.println("Invilid input");
			flag=false;
			return flag;
		}
		
		
	}
}
