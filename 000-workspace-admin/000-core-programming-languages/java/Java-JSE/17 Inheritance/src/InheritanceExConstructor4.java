class MMM{
	int x=10;
	MMM(int a){
		System.out.println("Hi M");
		x=a;
	}
	MMM(){
		System.out.println("Hello M");
	}
}
class NNN extends MMM{
	int y=20;
	NNN(int b){ super(8);
		System.out.println("Hi N");
		y=b;
	}
	NNN(){ 
		System.out.println("Hello N");
	}
}
public class InheritanceExConstructor4 {
	public static void main(String[] args) {
		//NNN n=new NNN(4);
		NNN n=new NNN();
		System.out.println(n.x+" "+n.y);
	}
}
