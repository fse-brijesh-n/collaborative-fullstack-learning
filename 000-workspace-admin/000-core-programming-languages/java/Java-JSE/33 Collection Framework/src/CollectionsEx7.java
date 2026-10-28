import java.util.*;

public class CollectionsEx7 {

	public static void main(String[] args) {
		//ArrayList a=new ArrayList();
		Vector a=new Vector();
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(5);
		a.add(12);
		a.add(14);
		a.add(10);
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Enumeration e=a.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}