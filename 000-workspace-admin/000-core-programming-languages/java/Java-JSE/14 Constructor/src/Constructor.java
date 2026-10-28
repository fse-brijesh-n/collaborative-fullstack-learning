class CST{
	String x;
	int y;
	void show() {
		System.out.println(x+""+y);
		System.out.println("Program executed successfully");
	}
	CST(String a ,int b){
		this("This keyword channing constructor");
		System.out.println("this finished");
		x=a;
		y=b;
		System.out.println("Constructor calling Ended going to calling show function");
	}
	CST(String c){
		this();
		System.out.println("Non parameterized this constructor finished");
		y=20;
	}
	CST(){
		System.out.println("This constructor returned to origin");
		
	}
}
public class Constructor {

	public static void main(String[] args) {
		 
		CST a=new CST("Brijesh",21);
		a.show();
	}

}
