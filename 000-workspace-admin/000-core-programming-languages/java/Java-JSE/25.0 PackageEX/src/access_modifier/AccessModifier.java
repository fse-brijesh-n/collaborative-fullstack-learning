package access_modifier;

/*
 * public access modifier
 * private access modifier
 * default access modifier
 * protected access modifier
 */
public class AccessModifier {
	
	public void doThisPublic() {
		System.out.println("Do this public:- Public access modifier is accessable in same pakage as well as out side the package ");
	}
	private void doThisPrivate() {
		System.out.println("Do this private:- pravate access modifier is accessable in same class");
	}
	
	void doThisDefault() {
		
		System.out.println("Do this default:- default access modifier is accessable in same pakage as well as same class");
		
	}
	protected void doThisProtected() {
		System.out.println("Do this protected:- protected access modifier is accessable in same class and and package as well as out side the package by inherited class");
	}

}

