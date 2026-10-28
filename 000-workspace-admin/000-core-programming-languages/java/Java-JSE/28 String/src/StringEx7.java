public class StringEx7 {
	public static void main(String[] args) {
		//StringBuilder s="Hi";//error
		StringBuilder s=new StringBuilder("Rahul Chauhan");//java-5(methods NOT synchronized)
		//StringBuffer s=new StringBuffer("Rahul Chauhan");//java-1(methods synchronized)
		System.out.println(s);
		s.append("Incapp");
		System.out.println(s);
		s.append(12);
		System.out.println(s);
		s.insert(2, "incapp");
		System.out.println(s);
		s.reverse();//
		System.out.println(s);
		s.replace(2,8,"rr");
		System.out.println(s);
		s.delete(2,8);
		System.out.println(s);
		
		//convert String Object(Immutable) to StringBuilder Object(Mutable)
		String x="rahul";
		StringBuilder y=new StringBuilder(x);
		//convert StringBuilder Object(Mutable) to String Object(Immutable)
		String z=y.toString();
	}
}