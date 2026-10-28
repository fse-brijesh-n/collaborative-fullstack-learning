import java.util.*;

public class CollectionsEx4 {

	public static void main(String[] args) {
		HashSet a=new HashSet();
//		ArrayList a=new ArrayList();
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(10);
		a.add(12);
		a.add(5);
		System.out.println(a);
		for(Object o:a) {
			System.out.println(o);
//			a.remove(o); //can not remove inside for-each loop Exception occurred: ConcurrentModificationException
		}
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();//allowed
		}
		
		System.out.println(a);
		System.out.println(a.isEmpty());
	}

}