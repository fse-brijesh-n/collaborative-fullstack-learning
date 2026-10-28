/*
 * final keyword use with
 * 1.final class--a class can't be inherited but may parents
 * 2.final method -- a method that can't overridden(non-static) and overridden(static) ,overloading allowed
 * 3.final variable --it can't be changed , final static variable treated as global variables for that memory allocates without class loading
 * */

final class FinalClassEX{
	void m1() {
		System.out.println("Hello A");
	}
	 static void m2() {
		System.out.println("Hi A");
	}
}
public class FinalClassEx {
	public static void main(String[] args) {
		FinalClassEX a=new FinalClassEX();
		a.m1();
		a.m2();
		Bx b=new Bx();
		b.m1();
		b.m2();
	}
}
//class B extends A{ //error
class Bx {
	void m1() {
		System.out.println("fdh hfg jrjytjytkjyt");//its not override(non-static) ,its self methods
	}
	void m2() {
		System.out.println("sjkfh kghre gtglkh rkleh");//its not overhide (static),its self methods
	}
}