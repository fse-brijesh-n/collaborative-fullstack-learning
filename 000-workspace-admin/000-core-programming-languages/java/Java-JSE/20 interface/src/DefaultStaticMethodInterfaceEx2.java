interface AA{
	void m();
	default void xyz() {
		System.out.println("HelloA -XYZ");
	}
}
interface CC{
	void m2();
	default void xyz() {
		System.out.println("HelloC -XYZ");
	}
}
class B{
	 public void xyz() {
		System.out.println("Hello -B");
	}
}
class XX extends B implements AA{
	public void m() {
		System.out.println("Hi X");
		xyz();//Hello B
	}
}
class YY implements AA,CC{//interface allowed multiple inheritance
	public void xyz() {
		System.out.println("HelloYY -XYZ");
	}
	public void m() {
		System.out.println("Hi Y");
		xyz();//HelloYY -XYZ
	}
	public void m2() {
		System.out.println("HEllo Y");
		xyz();//HelloYY -XYZ
	}
}
public class DefaultStaticMethodInterfaceEx2 {
	public static void main(String[] args) {
		AA a;
		a=new XX();
		a.m();
		a.xyz();
		a=new YY();
		a.m();
		a.xyz();
		XX x=new XX();
		x.m();
		x.xyz();
		YY y=new YY();
		y.m();
		y.m2();
		y.xyz();
	}
}