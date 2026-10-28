
public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.println("Logical Operator is also known as composion operator");
		int a=10,b=5;
		boolean r=a>b && b<a;//logical 'AND' operator gives true when both true and don't check further if exp1 is false
		System.out.println(r);
		boolean r1=a<b || b>a;//logical 'OR' operator gives false when both false and it check further if exp1 is false
		System.out.println(r1);
		boolean r2=a<b || b<a;
		System.out.println(!r1);
	}

}
