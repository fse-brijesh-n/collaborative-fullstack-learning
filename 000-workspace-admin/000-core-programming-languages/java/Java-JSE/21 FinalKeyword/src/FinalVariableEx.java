class AAA{
	//final int x; //error (Blank Final)
	final int x=10; //instance(non-static) variable -> class level variable
	final static int y=10; //class(static) variable -> class level variable
	void m() {
		//x=20; //error
		//y=20; //error
		System.out.println(x);
		System.out.println(y);
		final int z=30; //local variable
		//z=90; //error//cant change or reinitialized
		System.out.println(z);
		int k;
		//System.out.println(k);//error
	}
	void mm() {
		//System.out.println(z);//error
	}
}
public class FinalVariableEx {
	public static void main(String[] args) {
		AAA a=new AAA();
		//a.x=20; //error
		//A.y=20; //error
		System.out.println(a.x);
		System.out.println(AAA.y);
		a.m();
		//System.out.println(a.z);//error
		//System.out.println(AAA.z);//error
	}
}