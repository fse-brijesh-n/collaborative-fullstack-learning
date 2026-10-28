public class StringEx5 {
	public static void main(String[] args) {
		String s1=new String("Rahul");//'new' returns the reference of Heap String object
		s1=s1.intern();//'intern()' returns the reference of Pool String object
		System.out.println(s1);
	}
}
