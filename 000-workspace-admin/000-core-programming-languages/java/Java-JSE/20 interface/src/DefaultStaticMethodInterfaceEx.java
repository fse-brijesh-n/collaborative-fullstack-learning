//interface having byte code like classes 

//Java 8 introduced default and static methods
/*
in interface every method has public by default and 

default method is available for every child of interface and directly call by child class
static methods can't available for every child of interface and it can directlt call by interface name
*/

interface A{
	void m();
	default void xyz() {
		System.out.println("A-XYZ");
	}
	static void abc() {
		System.out.println("A-ABC");
	}
}
class X implements A{
	public void m() {
		System.out.println("Hi X");
		xyz();
		//abc();//error
		A.abc();//calll by interface name
	}
}
class Y implements A{
	public void m() {
		System.out.println("Hi Y");
		xyz();
	}
}
public class DefaultStaticMethodInterfaceEx {
	public static void main(String[] args) {
		A a;
		a=new X();
		a.m();
		a.xyz();//default method can access by reference of child
		a=new Y();
		a.m();
		a.xyz();
		X x=new X();
		x.xyz();
//		x.abc();//error// can't access by child reference
		A.abc();
	}
}