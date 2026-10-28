package p1;

public class B {
	public int y=20;
	public void m2() {
		System.out.println("Hello B");
		p1.A a = new A();//allowed
		System.out.println(a.x);
		System.out.println(a.j);
	//	System.out.println(a.u);//error private variable can't access out side the class
		a.m1();
		
		C c=new C();
		System.out.println(c.k);
		c.m3();
	}
}
