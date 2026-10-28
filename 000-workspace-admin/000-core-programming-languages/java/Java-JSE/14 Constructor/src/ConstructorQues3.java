class Question1{
	int x=10;
	String y="Rahul";
	Question1(){
		x=12;
		System.out.println("hi");
	}
}


public class ConstructorQues3 {
	public static void main(String[] args) {
		Question1 a= new Question1();
		System.out.println(a.x);
		System.out.println(a.y);
		
	}
}
//hi
//12
//rahul