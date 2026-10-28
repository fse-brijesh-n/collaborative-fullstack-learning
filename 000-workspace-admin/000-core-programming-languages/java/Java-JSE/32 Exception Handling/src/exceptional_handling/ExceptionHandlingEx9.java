package exceptional_handling;
class X{
	void m() {
		System.out.println("Hello X");
	}
}
public class ExceptionHandlingEx9 {

	public static void main(String[] args) {
		try {
			//X x=new X();
			X x=null;
			x.m();
			
			String s=null;
			//String s="Rahul";
			System.out.println(s.toUpperCase());
		}catch (NullPointerException ex) {
			System.out.println(ex);
		}
	}

}