class Abc{
	void m1() {
		System.out.println("Hello ABC");
	}
	void m2() {
		System.out.println("Hi ABC");
	}
}
interface Xyz{
	void m();
	void mm();
}
public class AnonymousNestedClassEx {
	public static void main(String[] args) {
		
		Abc aa=new Abc(){//its anonymous nested class to achieve instant runtime polymorphism
			void m() {
				System.out.println("uuuuuuuuu");
			}
			void m1() {
				System.out.println("iiiiiiiiii");
				m();
			}
		};
		aa.m1();
		aa.m2();
		//aa.m();//error
		
		Abc a=new Abc(){
			void m() {
				System.out.println("rtfhgfhjgfjyghf");
			}
			void m1() {
				System.out.println("Hello gfhnjgfjgfj");
				m();
			}
//			void m2() {
//				System.out.println("Ok dfhfghgfhjvgf");
//			}
			
		};
		a.m1();
		a.m2();
		//a.m(); //error
		
		Xyz x=new Xyz() {
			public void m() {
				System.out.println("tygutyutyiy");
			}
			public void mm() {
				System.out.println("oipopopo");
			}
		};
		x.m();
		x.mm();
	}
}