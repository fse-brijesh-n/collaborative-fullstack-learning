package access_modifier;

public class Main {

	public static void main(String[] args) {
		AccessModifier ac = new AccessModifier();
		ac.doThisPublic();
		//ac.doThisPrivate();//not allowed outside the class
		ac.doThisDefault();
		ac.doThisProtected();
	}

}
