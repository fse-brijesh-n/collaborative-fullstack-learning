class AAAA{
	int x=10;
	AAAA(){
		System.out.println("Hi A");
	}
	{
		System.out.println("Hello A");
	}
}
class BBBB extends AAAA{
	int y=20;
	BBBB(){
		System.out.println("Hi B");
	}
	{
		System.out.println("Hello B");
	}
}
public class InheritanceExInitializeBlock {
	public static void main(String[] args) {
		AAAA a=new AAAA();
		BBBB b=new BBBB();
	}
}