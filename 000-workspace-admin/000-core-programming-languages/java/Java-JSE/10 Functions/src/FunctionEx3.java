public class FunctionEx3 {
	static int add() {
		int x=10,y=20;
		int r=x+y;
		return r;
		//System.out.println("bye");//error
	}
	public static void main(String[] args) {
		int s=add();
		System.out.println("Sum: "+s);
		
		System.out.println("Sum: "+add());
		
		add();//allowed
	}
}
