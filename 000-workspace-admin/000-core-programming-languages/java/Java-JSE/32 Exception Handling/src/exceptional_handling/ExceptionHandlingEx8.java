package exceptional_handling;
public class ExceptionHandlingEx8 {

	public static void main(String[] args) {
		try {
			String s="292gfmj";
			int a=Integer.parseInt(s);
			System.out.println(a);
		}catch (NumberFormatException ex) {
			System.out.println(ex);
		}
	}

}