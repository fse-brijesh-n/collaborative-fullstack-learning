class X{
	int a=10;
	void m1() {
		System.out.println("Hello X");
	}
	static void m2() {
		System.out.println("Hi X");
	}
}
class Y extends X{
	int a=40;
	int b=20;
	void m1() {
		System.out.println("Hello Y");
	}
	static void m2() {
		System.out.println("Hi Y");
	}
	void m3() {
		System.out.println("INCAPP");
	}
}
public class RunTimePolymorphismQues {
	public static void main(String[] args) {
		X x=new X();
		System.out.println(x.a);
		x.m1();
		x.m2();
		//System.out.println(x.b);//error
		//x.m3();//error
		x=new Y();
		System.out.println(x.a);
		x.m1();
		x.m2();
		//System.out.println(x.b);//error
		//x.m3();//error
		Y y=new Y();
		System.out.println(y.a);
		y.m1();
		y.m2();
		System.out.println(y.b);
		y.m3();
	}
}