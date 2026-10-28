
public class Questions {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number to get squire and cube");
		int a=sc.nextInt();
		System.out.println("a^2:"+a*a);
		System.out.println("a^3:"+a*a*a);
		
		System.out.println("Enter principal ammount");
		double p=sc.nextInt();
		System.out.println("Enter rate");
		int r=sc.nextInt();
		System.out.println("Enter time");
		int t=sc.nextInt();
		System.out.println("simple interest:"+((p*r*t)/100));
		
	}

}
