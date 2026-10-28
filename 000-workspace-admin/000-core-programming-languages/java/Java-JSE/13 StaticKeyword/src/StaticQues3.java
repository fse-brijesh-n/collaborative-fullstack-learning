class X{
	static int a=10;
	String b;
	void show() {
		a++;
		System.out.println(a+b);
	}
	static void display() {
		System.out.println("Hello X");
	}
}
public class StaticQues3 {
	public static void main(String[] args) {
		System.out.println(X.a);
		X x1=new X();
		x1.show();
		X.display();
		System.out.println(X.a);
	}
}
