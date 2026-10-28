public class FunctionEx2 {
	static void add(int x,int y ) {
		int r=x+y;
		System.out.println("Sum: "+r);
	}
	public static void main(String[] args) {
		add(5,7);
		add(9,5);
		add(25,87);
		add('a',5);
		//add();//error
		//add(7);//error
		//add(8,9,5);//error
		//add(8.0,9);//error
		int a=15;
		add(a,5);
	}
}
