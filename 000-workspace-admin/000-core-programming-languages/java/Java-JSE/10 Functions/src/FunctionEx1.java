public class FunctionEx1 {
	static void add() {
		int a=10,b=20;
		int r=a+b;
		System.out.println("Sum: "+r);
	}
	public static void main(String[] args) {
		add();
		add();
		add();
		//add(5,7);//error
	}
}