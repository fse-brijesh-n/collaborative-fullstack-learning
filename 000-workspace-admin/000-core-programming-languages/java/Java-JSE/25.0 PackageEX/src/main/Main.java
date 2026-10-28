package main;
import access_modifier.AccessModifier;
public class Main  {

	public static void main(String[] args) {
		AccessModifier ac = new AccessModifier();
		ac.doThisPublic();
//		ac.doThisPrivate();//not allowed
//		ac.doThisDefault();//Not allowed
		//ac.doThisProtected();//not allowed  because not inherited
		
		
		//p1.C c=new p1.C();//error
		p1.A a=new p1.A();
		System.out.println(a.x);
		//System.out.println(a.j);//error
		a.m1();
		p1.B b=new p1.B();
		System.out.println(b.y);
		b.m2();
		p2.A aa=new p2.A();
		System.out.println(aa.h);
		aa.m();
		p2.D d=new p2.D();
		System.out.println(d.z);
		d.m3();
	}

}
