class Addition{
	void add(int x,int y) {
		int r=x+y;
		System.out.println("Addition= "+r);
	}
	static void add(String x,String y) {
		String r=x+y;
		System.out.println("Concatination= "+r);
	}
	void add(double x,double y) {
		double r=x+y;
		System.out.println("Sum= "+r);
	}
}
public class CompileTimePolymorphismEx {
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(56,14);
		a.add(3.6,8.9);
		a.add("Hello","Hi");
		a.add(43,8);
	}
}
