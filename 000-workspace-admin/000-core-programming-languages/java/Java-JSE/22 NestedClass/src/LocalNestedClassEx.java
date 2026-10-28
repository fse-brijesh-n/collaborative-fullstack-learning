class AAA{ //Outer/Upper class
	int x=10;
	static int g=80;
	private int z=70;
	void m() {
		System.out.println("Hello A");
		class B{ //Local Nested
			int y=20;
			static int h=90;
			void m2() {
				System.out.println("Hello B");
				System.out.println(x);
				System.out.println(g);
				System.out.println(z);
				System.out.println(y);
				System.out.println(h);
			}
		}
		//System.out.println(y);//error
		//System.out.println(h);//error
		System.out.println(B.h);
		B b=new B();
		System.out.println(b.y);
		b.m2();
	}
	void mm() {
		//B b=new B();//error
	}
}
public class LocalNestedClassEx {

	public static void main(String[] args) {
		//B b=new B(); //error
		//AAA.B b=new AAA.B(); //error
		AAA a=new AAA();
		//AAA.B b=a.new B(); //error
		a.m();
	}
}