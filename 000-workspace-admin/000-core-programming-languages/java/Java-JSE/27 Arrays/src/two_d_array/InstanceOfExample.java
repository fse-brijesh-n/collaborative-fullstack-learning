package two_d_array;
class AA{
}
class B{
}
class X extends AA{
}
class Y extends X{
}
public class InstanceOfExample {
	public static void main(String[] args) {
		AA a=new X();
		X x=new X();
		System.out.println(a instanceof AA); //true
		System.out.println(x instanceof AA); //true
		System.out.println(x instanceof X); //true
		System.out.println(a instanceof X); //true
		System.out.println(a instanceof Y); //false
		System.out.println(x instanceof Y); //false
		//System.out.println(a instanceof B);//error
	}
}
