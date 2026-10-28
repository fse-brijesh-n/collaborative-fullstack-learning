//thess having has A realation classes
class A{
	int x=10;
	void m1() {
		System.out.println("Hello A");
	}
}
class B{
	int y=20;
	void m2() {
		System.out.println("Hello B");
	}
}
class D{
	int z=30;
	A a=new A();
	B b=new B();
	void m() {
		System.out.println(z);
		//System.out.println(x);//error
		System.out.println(a.x);
		a.m1();
		System.out.println(b.y);
		b.m2();
	}
}
class X extends D{
	//is A realation
}
public class NestedObjectEx {
	public static void main(String[] args) {
		D d=new D();
		System.out.println(d.z);
		d.m();
		//System.out.println(d.x);//error
		System.out.println(d.a.x);
		System.out.println(d.b.y);
		d.a.m1();
		d.b.m2();
	}
}