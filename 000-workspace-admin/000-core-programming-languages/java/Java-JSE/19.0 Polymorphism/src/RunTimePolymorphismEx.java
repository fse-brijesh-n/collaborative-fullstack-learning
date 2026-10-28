class Animal{
	void eat() {
		System.out.println("Animal's Eat");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog's Eat");
	}
}
class Elephant extends Animal{
	void eat() {
		System.out.println("Elephant's Eat");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("Cat's Eat");
	}
}
public class RunTimePolymorphismEx {
	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.eat();
		Animal a2=new Dog();
		a2.eat();
		Animal a3=new Cat();
		a3.eat();
		Animal a4=new Elephant();
		a4.eat();
		
		//or
		
		Animal a;
		a=new Animal();
		a.eat();
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
		a=new Elephant();
		a.eat();
		a.eat();
	}
}
