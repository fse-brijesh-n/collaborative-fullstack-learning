package incapp;

//import p1.A;
//import p1.p2.B;
import p1.*;//"*" is wild curd character 
import p1.p2.*;

public class SubPackageEx {

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.y);
		A a=new A();
		System.out.println(a.x);
		a.m1();
	}

}
