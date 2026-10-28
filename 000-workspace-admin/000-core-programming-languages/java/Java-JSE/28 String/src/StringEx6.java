public class StringEx6 {
	public static void main(String[] args) {
		String s1="Rahul Chauhan";
		String s2="Rajput";
		System.out.println(s1.toUpperCase());
		System.out.println("Incapp".toUpperCase());
		System.out.println(s1.toLowerCase());
		//System.out.println(s1[2]);//error
		System.out.println(s1.charAt(2));
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		for(int x=0;x<s1.length();x++)
			System.out.println(s1.charAt(x));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,8));
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.indexOf('h',3));
		System.out.println(s1.indexOf('k'));
		System.out.println(s1.lastIndexOf('h'));
		System.out.println(s1.indexOf("Chauhan"));
		System.out.println("  ram          kumar  ".trim());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Rahul Chauhan"));
		System.out.println(s1.equals("Rahul chauhan"));
		System.out.println(s1.equalsIgnoreCase("Rahul chauhan"));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
