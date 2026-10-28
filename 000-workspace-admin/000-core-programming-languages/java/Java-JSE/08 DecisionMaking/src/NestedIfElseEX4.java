
public class NestedIfElseEX4 {

	public static void main(String[] args) {
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("Enter your age");
		 int a=sc.nextInt();
		 if(a<=0 || a>=120) {
			 System.out.println("Invalid age");
		 }
		 else {
			 
			 if(a>=13 && a<=19)
				 System.out.println("You are Teenager"+a);
			 else
				 System.out.println("Not Teenager");
			 System.out.println("Thanks for using APP");
			
		 }
		 
	 }

}
