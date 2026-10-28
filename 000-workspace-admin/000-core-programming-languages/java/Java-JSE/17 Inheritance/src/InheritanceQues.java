class AAAAA{
	int x=10;
	AAAAA(){
		System.out.println("Hi A");
	}
	{
		System.out.println("Hello A");
	}
	static {
		System.out.println("OK A");
	}
}
class BBBBB extends AAAAA{
	int y=20;
	BBBBB(){
		System.out.println("Hi B");
	}
	{
		System.out.println("Hello B");
	}
	static {
		System.out.println("OK B");
	}
}
public class InheritanceQues {
	public static void main(String[] args) {
		BBBBB b=new BBBBB();
		System.out.println(b.x+" "+b.y);
	}
}
