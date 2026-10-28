import java.util.*;

public class CollectionsEx8 {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		
//		a.addFirst(10);
//		a.addFirst("Ram");
//		a.addFirst(7.2);
//		a.addFirst(10);
//		a.addFirst(12);
//		a.addFirst(5);
		
//		a.addLast(10);
//		a.addLast("Ram");
//		a.addLast(7.2);
//		a.addLast(10);
//		a.addLast(12);
//		a.addLast(5);
		
		a.addFirst(10);
		a.addLast("Ram");
		a.addLast(7.2);
		a.addFirst(90);
		a.addLast(10);
		a.addLast(5);
		
		System.out.println(a.get(3));
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}