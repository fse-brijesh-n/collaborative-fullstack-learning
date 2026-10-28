import java.util.*;

public class CollectionsEx2 {

	public static void main(String[] args) {
		//HashSet a=new HashSet();//stores objects randomly
		LinkedHashSet a=new LinkedHashSet();//subclass of HashSet :stores objects with sequence
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(10);
		a.add(12);
		a.add(5);
		System.out.println(a);
		a.remove(12);//remove a/c object
		//a.remove((Integer)12);//remove a/c object
		System.out.println(a);
		
	}

}