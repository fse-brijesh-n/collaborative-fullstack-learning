package two_d_array;
//Singleton Class
class MyClass{
	int x=90;
	void m() {
		System.out.println("Hello");
	}
	private MyClass() {
		
	}
	private static MyClass obj=new MyClass();
	static MyClass getObj() {
		return obj;
	}
}
public class SingletonClassEx {
	public static void main(String[] args) {
		MyClass m1=MyClass.getObj();
		MyClass m2=MyClass.getObj();
		m1.x=45;
		System.out.println(m1.x);
		System.out.println(m2.x);
	}
}	