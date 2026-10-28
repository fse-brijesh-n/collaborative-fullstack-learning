class C{
	static {
		System.out.println("Hello C");
	}
	String x;
	static{	
		System.out.println("OK C");
		//System.out.println(y);//error
	}
	static int y;
	static {
		System.out.println("Hi C");
		System.out.println(y);
	}
}
public class StaticBlockEx3 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		C c1=new C();
		C c2=new C();
		System.out.println("Bye Main");
	}
}
