@FunctionalInterface
interface Add{
	int sum(int x,int y);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		
		Add a=(x, y)->{
			int r=x+y;
			return r;
		};
		
		int result=a.sum(9,8);
		System.out.println("Addition: "+result);
		
	}
}
