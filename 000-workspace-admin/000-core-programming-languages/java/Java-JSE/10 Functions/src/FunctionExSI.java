public class FunctionExSI {
	static double findSI(double p,double r,double t) {
		double si=p*r*t/100;
		return si;
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter Principle: ");
		double p=sc.nextDouble();
		System.out.println("Enter Rate: ");
		double r=sc.nextDouble();
		System.out.println("Enter Time: ");
		double t=sc.nextDouble();
		
		double reuslt=findSI(p,r,t);
		System.out.println("Simple Interest is "+reuslt);
	}
}
