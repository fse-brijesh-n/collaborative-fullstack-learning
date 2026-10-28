public class StringEx1 {

	public static void main(String[] args) {
		char a[]= {'R','a','h','u','l'};
		String n=new String("Rahul");
		System.out.println(a);
		//System.out.println(a.toUpperCase());//error
		System.out.println(n);
		System.out.println(n.toUpperCase());
		System.out.println(a[2]);
		//System.out.println(n[2]);//error
		System.out.println(n.charAt(2));
	}

}
