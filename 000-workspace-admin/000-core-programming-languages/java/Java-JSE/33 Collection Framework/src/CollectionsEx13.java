import java.util.*;

public class CollectionsEx13 {

	public static void main(String[] args) {
		List a=new ArrayList();
		a.add(15);
		a.add("ram");
		a.add(78);
		a.add(5.6);
		a.add(78);
		
		Set s=new HashSet();
		
		for(Object o:a) {
			s.add(o);
		}

		System.out.println(a);
		System.out.println(s);
	}

}