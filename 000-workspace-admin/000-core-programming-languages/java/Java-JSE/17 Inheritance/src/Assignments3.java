class assignInheritanceQ3 {
	int x = 10;

	assignInheritanceQ3() {
		System.out.println("Hi A");
	}

	assignInheritanceQ3(int a) {
		this();
		System.out.println("Hello A");
		x = a;
	}
}

class Child3 extends assignInheritanceQ3 {
	Child3(int b) {
		super();
		x = b;
		System.out.println("Hi B");
	}
}

class Assignments3 {
	public static void main(String[] args) {
		Child3 b = new Child3(5);
		System.out.println(b.x);
		assignInheritanceQ3 a = new assignInheritanceQ3(3);
		System.out.println(a.x);
	}
}

/*
 * Hi A
 * Hi B
 * 5
 * Hi A
 * Hello A
 * 3
 * 
 * 
 * 

 */
