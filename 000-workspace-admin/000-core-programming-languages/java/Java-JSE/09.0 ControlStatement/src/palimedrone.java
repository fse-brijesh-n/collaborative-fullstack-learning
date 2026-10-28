public class palimedrone {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number to check Palimedrome:");
		int n=sc.nextInt();
		int copy=n;
		int rev=0;
		while(n!=0) {
			int r=n%10;
			rev =rev*10+r;
			n/=10;
		}
		if(rev==copy) {
			System.out.println(copy+" is palimedrome");
		}else {
			System.out.println(copy+" is NOT palimedrome");
		}
	}
}
