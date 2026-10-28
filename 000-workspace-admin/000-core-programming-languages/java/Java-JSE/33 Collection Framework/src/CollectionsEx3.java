import java.util.*;

public class CollectionsEx3 {

	public static void main(String[] args) {
		TreeSet a=new TreeSet();
		a.add(10);
		a.add(23);
		a.add(72);
		//a.add("hghg"); // ClassCastException Occurred
		a.add(10);
		a.add(12);
		a.add(5);
		System.out.println(a);
		for(Object o:a) {
			System.out.println(o);
		}
		
		a=new TreeSet();
		a.add("rahul");
		a.add("tina");
		a.add("kk");
		a.add("hgvhg");
		a.add("erreg");
		a.add("hggvhg");
		System.out.println(a);
		for(Object o:a) {
			System.out.println(o);
		}
	}

}