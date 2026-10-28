class Bird{
	String name;
	int age;
	void show() {
		System.out.println(name+age);
	}
	Bird(){
		System.out.println("Hi Bird");
	}
	Bird(String n,int a){
		System.out.println("hello Bird");
		name=n;
		age=a;
	}
}
public class ConstructorEx3 {
	public static void main(String[] args) {
		Bird a1=new Bird("Gogo Singh",21);
		Bird a2=new Bird();
		Bird a3=new Bird("Cheetah Khan",19);
		a1.show();
		a2.show();
		a3.show();
	}

}
