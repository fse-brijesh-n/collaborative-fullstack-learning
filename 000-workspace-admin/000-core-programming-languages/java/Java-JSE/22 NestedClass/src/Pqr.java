//nested class creates parent class followed by $ symbol 
class Y{  }					//Y.class
public class Pqr {			//Pqr.class
	class A{				//Pqr$A.class
		class B{ }			//Pqr$A$B.class
	}
	class B{ }				//Pqr$B.class
	static class D{ }		//Pqr$D.class
	void m1() {
		class B{ }			//Pqr$1B.class
		class C{ }			//Pqr$1C.class
		B b=new B();
		Y y=new Y() { };	//Pqr$1.class
	}
	Pqr(){
		class B{ }			//Pqr$2B.class
		class D{ }			//Pqr$1D.class
	}
	void m2() {
		class B{ }			//Pqr$3B.class
		class E{ }			//Pqr$1E.class
		B b=new B();
		Y y=new Y() { };	//Pqr$2.class
		E e=new E() { };	//Pqr$3.class
	}
}