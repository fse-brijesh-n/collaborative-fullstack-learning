import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListCollection 
{
	public static void main(String[] args) 
	{
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("Rahul",24));
		list.add(new Person("Imran",45));
		list.add(new Person("David",29));
		list.add(new Person("Ramesh",50));
		list.add(new Person("Suman",26));
		list.add(new Person("Amit",22));
		list.add(new Person("Atul",29));
		
		//Display details of those persons whose age is less than 25
		list.stream().filter((person)->person.getAge()<30).forEach(p->System.out.println(p));
	}
}
