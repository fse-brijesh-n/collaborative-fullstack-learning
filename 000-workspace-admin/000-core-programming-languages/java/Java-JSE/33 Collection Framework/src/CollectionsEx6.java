import java.util.*;

public class CollectionsEx6 {

	public static void main(String[] args) {
		//ArrayList a=new ArrayList(50);//version-1.2, methods are not synchronized,Only Capacity is allowed(not Increment Size),Iterator & ListIterator allowed(Enumeration not allowed)
		Vector a=new Vector(50,100);//version-1.0, methods are synchronized,Capacity & Increment Size allowed, Iterator & ListIterator & Enumeration allowed
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(10);
		a.add(12);
		a.add(5);
		a.add(12);
		a.add("Ram");
		
		a.add(2,"kjdfghdfkhkh");
		
		Double d=(Double)a.get(2);
		System.out.println(d);
		

		
		
		System.out.println(a);
		a.remove(2);//remove a/c index
		//a.remove(12);//IndexOutOfBoundsException
		a.remove((Integer)12);//remove a/c object
		a.remove("Ram");
		System.out.println(a);
	}

}