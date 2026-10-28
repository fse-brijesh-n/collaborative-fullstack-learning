import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListCollection3 
{
	public static void main(String[] args) 
	{
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("Rahul",24));
		list.add(new Person("Imran",21));
		list.add(new Person("David",29));
		list.add(new Person("Ramesh",50));
		list.add(new Person("Suman",24));
		list.add(new Person("Amit",22));
		list.add(new Person("Atul",21));
		
		Collections.sort(list,(p1,p2)->p2.getAge()-p1.getAge());
		for(Person person:list)
		{
			System.out.println(person);
		}
	}
}
