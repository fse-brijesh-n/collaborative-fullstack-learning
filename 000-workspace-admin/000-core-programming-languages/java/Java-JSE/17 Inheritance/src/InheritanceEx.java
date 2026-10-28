class A{
	int x=10;
	static int h=10;
	private int g=30;
	void showG() {
		System.out.println(g);
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class B extends A{
	int y=20;
	void m2() {
		System.out.println("Hello B");
		System.out.println(y);
		//System.out.println(g);//error
		showG();
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		A a=new A();
		a.x=15;
		a.h=15;
		System.out.println(a.x);
		System.out.println(a.h);
		a.m1();
		B b=new B();
		System.out.println(b.x);
		System.out.println(b.h);
		System.out.println(b.y);
		//System.out.println(b.g);//error
		b.showG();
		b.m1();
		b.m2();
	}
}