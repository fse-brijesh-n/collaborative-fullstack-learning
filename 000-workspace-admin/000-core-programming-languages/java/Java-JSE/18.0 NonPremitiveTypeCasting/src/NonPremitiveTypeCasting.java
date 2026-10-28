//non-primitive typecasting
class A{
	
}
class B extends A{
	
}

public class  NonPremitiveTypeCasting {
	public static void main(String[] args) {
		//upcasting
		A a1=new A();
		B b1=new B();
		
		a1=b1;//or
		A a=new B();
		
		//downcasting
		A a2=new A();
		B b2=new B();
		
//		b2=a2;//error child can't holds parents objects
//		b2=(B)a2;// compile time error child can't holds parents objects
		B x=new B();
		a2=b2;//upcasting
		b2=(B)a2;//downcasting
		
		
		
	}
}
