package cla;
public class CLAEx {

//	static public void main(String []s){
	static public void main(String ... s){
		System.out.println("Hello");
		for(String x:s){
			System.out.println(x);
		}
		System.out.println("Bye");
	}

}