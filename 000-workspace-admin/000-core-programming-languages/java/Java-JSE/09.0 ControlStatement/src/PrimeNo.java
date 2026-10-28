public class PrimeNo {
	public static void main(String[] args) {
java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number to find Prime:");
		int n=sc.nextInt();
		if(n>1) {
			boolean flag=true;
			for(int x=2;x<=n/2;x++) {
				if(n%x==0) {
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(n+" is Prime");
			else
				System.out.println(n+" is NOT Prime");
		}else {
			System.out.println("Invlaid Number");
		}
	}
}
