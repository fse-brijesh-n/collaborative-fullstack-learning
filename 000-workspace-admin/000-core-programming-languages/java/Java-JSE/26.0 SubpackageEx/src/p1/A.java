package p1;
//import p2.B;//error
import p1.p2.B;

public class A {
	public int x=10;
	public void m1() {
		System.out.println("Hello A");
		B b=new B();
		System.out.println(b.y);
	}
}
