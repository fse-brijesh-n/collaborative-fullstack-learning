class Human{
	String name;
	int age;
	void show() {
		System.out.println(name+age);
	}
	Human(String n,int a){
		System.out.println("hello Human");
		name=n;
		age=a;
	}
}
public class ConstructorEx2 {
	public static void main(String[] args) {
		//Human a1=new Human();//error
		Human a1=new Human("Gogo Singh",21);
		Human a2=new Human("Yoyo Gupta",22);
		Human a3=new Human("Cheetah Khan",19);
		//Human a1=new Human("Gogo Singh");//error
		a1.show();
		a2.show();
		a3.show();
	}

}