public class StringEx9 {
	public static void main(String[] args) {
		String s="I love my INDIA";
		
		//since 1.4
		
//		String s1[]=s.split(" ");
//		String s1[]=s.split("my");
		String s1[]=s.split("I");
		for(String x:s1) {
			System.out.println(x);
		}
	}
}