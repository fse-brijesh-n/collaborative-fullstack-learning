class B{
	static {
		System.out.println("Hello B");
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		//Static Block are the block which only once run automatically allocate and execute 
		//Syntax
		/*
		 * Rules for static -->> Static can access only static variables or the static method
		 * 
		 * */
		System.out.println("Loading main after static");
		B b=new B();
	}
	
	
	static {
		
		System.out.println("Static load firstly in the main class");
		
	}
	

//Reason of public void 
	/*
	 * JVM runs the main() by classname.main() so we are making public static void main();
	 * it means without creating object , we can directly call the the main() via the class name 
	 * that's why we are writing main() as a static method
	 * 
	 *
	Why the main() method must be public and static for JVM ??
	Answer: Public: JVM calls the main method from outside your class and package that's why the main methods was public 
	Static: JVM calls the main methods via class name that's why main method must be static 
	(JVM do not create the object of main class to call main method)
	*
	* 
	*
	 * */
}
