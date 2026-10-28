import java.util.*;

public class CollectionsEx5 {

	public static void main(String[] args) {
//		ArrayList a=new ArrayList();//by default capacity 10
//		ArrayList a=new ArrayList(50);
		Vector a=new Vector();//by default capacity 10
//		Vector a=new Vector(50);
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(10);
		a.add(12);
		a.add(5);
		System.out.println(a.size());
		
//		To get object in reverse
		for(int x=a.size()-1;x>=0;x--)
			System.out.println(a.get(x));
		
		Iterator i=a.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		//System.out.println(i.previous());//error
		
		ListIterator l=a.listIterator();//ListIterator(sub interface of Iterator) works with List ONLY (not with Set or Map).
		System.out.println(l.next());
		System.out.println(l.next());
		System.out.println(l.next());
		System.out.println(l.previous());
		System.out.println(l.previous());
		System.out.println(l.previous());
	}

}