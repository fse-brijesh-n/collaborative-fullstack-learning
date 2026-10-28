public class Armstrong {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a 3-digit number to check Armstrong:");
		int n=sc.nextInt();
		int copy=n;
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum += r*r*r;
			n/=10;
		}
		if(sum==copy) {
			System.out.println(copy+" is Armstrong");
		}else {
			System.out.println(copy+" is NOT Armstrong");
		}
	}
}
