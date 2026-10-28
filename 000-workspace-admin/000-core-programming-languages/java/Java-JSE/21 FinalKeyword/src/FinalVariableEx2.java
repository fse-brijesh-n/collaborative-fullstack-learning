class My{
	static final int x=10;
	static int y=80;
	static{
		System.out.println("Hello");
	}
}
public class FinalVariableEx2 {
	public static void main(String[] args) {
		System.out.println(My.x);
		System.out.println(My.y);
	}
}

