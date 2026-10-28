class H {
	int x = 10;

	H(int a) {
		this();
		System.out.println("Hi H");
		x = a;
	}

	H() {
		System.out.println("Hello H");
	}
}

class G extends H {
	int y = 20;

	G(int b) {
		this();
		System.out.println("Hi G");
		y = b;
	}

	G() {
		super(5);
		System.out.println("Hello G");
	}
}

public class InheritanceExConstructor5 {
	public static void main(String[] args) {
		G g = new G(4);
		// G g=new G();
		System.out.println(g.x + " " + g.y);
	}
}
