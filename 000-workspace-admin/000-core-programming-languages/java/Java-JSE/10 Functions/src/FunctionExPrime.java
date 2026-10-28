public class FunctionExPrime {
	static boolean findPrime(int n) {
		boolean flag=true;
		for(int a=2;a<=n/2;a++) {
			if(n%a==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter a no.: ");
		int n=sc.nextInt();
		
		if(n<2) {
			System.out.println("Invalid Number.");
		}else {
			boolean reuslt=findPrime(n);
			if(reuslt) {
				System.out.println(n+" is Prime No.");
			}else{
				System.out.println(n+" is NOT Prime No.");
			}
		}
	}
}
