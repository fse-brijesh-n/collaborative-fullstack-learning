class A{
int x=10;
String y="Rahul";
void show() {
System.out.println(x+y);
}
}
class Test {
public static void main(String[] args) {
A a= new A();
A b= new A();
a.x=15;
a.show();
a.y="YoYo";
b.show();
b.y="Ramu";
a.show();
b.show();
}
}