
class Aa {
	int a=15;
}
class Bb{
	int b=46;
}
class Cc{
	int c=25;
}
class Dd {
	int x=20;
	Aa a=new Aa();
	Bb b=new Bb();
	Cc c=new Cc();
}
public class NestedObjectEx1 {

	public static void main(String[] args) {
		Dd d=new Dd();
		System.out.println(d.x);
		System.out.println(d.a.a);
		System.out.println(d.b.b);
		System.out.println(d.c.c);
		
		
	}
	
}



