class AA{ //Outer/Upper class
	int x=10;
	static int g=80;
	private int z=70;
	void m() {
		System.out.println("Hello A");
		//System.out.println(y);//error
		//System.out.println(h);//error
		System.out.println(B.h);
		B b=new B();
		System.out.println(b.y);
		b.m2();
	}
	static class B{ //Static Nested
		int y=20;
		static int h=90;
		void m2() {
			System.out.println("Hello B");
			//System.out.println(x);//error
			System.out.println(g);
			//System.out.println(z);//error
			System.out.println(y);
			System.out.println(h);
		}
	}
}
public class StaticNestedClassEx {

	public static void main(String[] args) {
		//B b=new B(); //error
		System.out.println(AA.B.h);
		System.out.println(AA.g);
		AA.B b=new AA.B();
		System.out.println(b.y);
		b.m2();
		//System.out.println(b.x);//error
	}
}