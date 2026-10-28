import java.util.*;

public class CollectionsEx1 {

	public static void main(String[] args) {
		//HashSet a=new HashSet();//Set Collection
		ArrayList a=new ArrayList();//List Collection
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(10);
		a.add(12);
		a.add(5);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(1));
		a.set(3, 78);
		
		for(Object o:a) {
			System.out.println(o);
		}
	}

}