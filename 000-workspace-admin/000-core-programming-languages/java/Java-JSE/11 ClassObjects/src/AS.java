class AS{
private int x;
public void show() {
x++;
System.out.println(x);
}
public static void main(String[] args) {
A a= new A();
a.show();
A b= new A();
a.show();
b.show();
}
}