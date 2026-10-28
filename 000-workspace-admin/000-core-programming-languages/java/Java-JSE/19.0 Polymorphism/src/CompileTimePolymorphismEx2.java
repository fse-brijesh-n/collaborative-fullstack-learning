class Sum{
	static void add(String x,String y) {
		String r=x+y;
		System.out.println("Concatination= "+r);
	}
	void add(double x,double y) {
		double r=x+y;
		System.out.println("Sum= "+r);
	}
}
class Additionnnn extends Sum{
	void add(int x,int y) {
		int r=x+y;
		System.out.println("Addition= "+r);
	}
}
public class CompileTimePolymorphismEx2 {
	public static void main(String[] args) {
		Additionnnn a=new Additionnnn();
		a.add(56,14);
		a.add(3.6,8.9);
		a.add("Hello","Hi");
		a.add(43,8);
	}
}
