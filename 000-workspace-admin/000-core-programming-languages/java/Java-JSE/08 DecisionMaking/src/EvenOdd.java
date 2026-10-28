
public class EvenOdd {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		 
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		boolean flag=false;
		if(a%2==0) {
			flag=true;
		}
		
		if(flag) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	

}
