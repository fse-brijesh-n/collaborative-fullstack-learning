package one_d_array;
class A{
	int x=90;
	void m() {
		System.out.println("Hello A");
	}
}
public class ArrayEx8 {
	public static void main(String[] args) {
		//Normal way of creating objects
//		A a=new A();
//		A b=new A();
//		A c=new A();
//		A d=new A();
		
		//creating objects via Array
		A a[]=new A[4];
		a[0]=new A();
		a[1]=new A();
		a[2]=new A();
		a[3]=new A();
		//or
	//	A aa[]={new A(), new A(), new A(), new A()};
		//or
		A aaa[]=new A[4];
		for(int i=0;i<aaa.length;i++) {
			aaa[i]=new A();
		}
		
		//accessing one of the object
		a[2].m();
		System.out.println(a[2].x);
		
		for(A k:aaa) {
			System.out.println(k.x);
		}
	}
}
