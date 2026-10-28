package p3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1.C c=new p1.C();
		p1.A a=new p1.A();
		System.out.println(a.x);
//		System.out.println(a.j);//error default can't access out side the package
		a.m1();
		p1.B b=new p1.B();
		System.out.println(b.y);
		b.m2();
		p2.A aa=new p2.A();
		System.out.println(aa.h);
		aa.m();
		p2.D d=new p2.D();
		System.out.println(d.z);
		d.mm();

	}

}
