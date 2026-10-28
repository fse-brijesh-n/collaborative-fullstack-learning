package p1;
import access_modifier.*;
public class A extends protected_access{
	public int x=10;
	int j=85;
	private int u=70;
	public void m1() {
		System.out.println("Hello A");
		System.out.println(x);
		System.out.println(j);
		System.out.println(u);
		AccessModifier ac=new AccessModifier();
		ac.doThisPublic();
		System.out.println("Protected access outside the package if inherited:"+name);
		doThisProtected();//allowed
		
		
		
	}
}