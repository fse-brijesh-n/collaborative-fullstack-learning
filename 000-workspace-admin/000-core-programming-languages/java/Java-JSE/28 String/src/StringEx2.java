public class StringEx2 {

	public static void main(String[] args) {
		//char n[]="Rahul"; //error [String literal is by-default String class Object]
		String s1=new String("Rahul");
		String s2="Rahul";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s2);
		System.out.println(s2.toUpperCase());
	}

}
