class MM{
	int x=10;
	MM(int a){
		System.out.println("Hi M");
		x=a;
	}
	MM(){
		System.out.println("Hello M");
	}
}
class NN extends MM{
	int y=20;
	NN(){ super(5);
		System.out.println("Hello N");
	}
}
public class InheritanceExConstructor3 {
	public static void main(String[] args) {
		NN n=new NN();
		System.out.println(n.x+" "+n.y);
	}
}
