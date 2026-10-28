
public class ValueMatch {

	public static void main(String[] args) {
		 /*float boolean double and long are not allowed
		  * case always fixed values lateral
		  * */
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		switch(x) {
			
			default :
				System.out.println("Invalid day");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			
			
		}
	}

}
