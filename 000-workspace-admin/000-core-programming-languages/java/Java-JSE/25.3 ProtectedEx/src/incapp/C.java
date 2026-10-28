package incapp;
import p1.A;
public class C extends A{
	public void m() {
		System.out.println(x); //allowed
		
		A a=new A();
		//System.out.println(a.x);//error
	}
}
class K{
	void m() {
		C c=new C();
		//System.out.println(c.x);//error
	}
}
