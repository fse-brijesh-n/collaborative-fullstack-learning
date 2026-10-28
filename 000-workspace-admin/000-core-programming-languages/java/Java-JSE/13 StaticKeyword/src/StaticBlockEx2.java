class St {
	static {
		System.out.println("Hello B");
	}
	String x;
	int y;
	void show() {				
		System.out.println(x+" "+y);
	}
	static {
		System.out.println("Hi B");
	}
}
public class StaticBlockEx2 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		St b1=new St();
		St b2=new St();
		b1.show();
		b2.show();
		System.out.println("Bye Main");
	}
}
