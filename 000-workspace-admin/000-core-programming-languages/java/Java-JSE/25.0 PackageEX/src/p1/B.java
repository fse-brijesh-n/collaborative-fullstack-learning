package p1;

public class B {
	public int y=20;
	public void m2() {
		System.out.println("Hello B");
		//p1.A a=new p1.A(); //allowed
		A a=new A();
		System.out.println(a.x);
		System.out.println(a.j);
		//System.out.println(a.u);//error
		a.m1();

		C c=new C();
		System.out.println(c.k);
		c.mm();
	}
}