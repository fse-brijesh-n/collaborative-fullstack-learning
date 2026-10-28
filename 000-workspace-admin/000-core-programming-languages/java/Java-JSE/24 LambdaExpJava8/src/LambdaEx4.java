@FunctionalInterface
interface Square{
	int sqr(int a);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		
//		Square s=(x)->{
//			return x*x;
//		};
		
//		Square s=x->{
//			return x*x;
//		};
		
		Square s=x-> x*x;
		
		int result=s.sqr(9);
		System.out.println("Square: "+result);
		
	}
}