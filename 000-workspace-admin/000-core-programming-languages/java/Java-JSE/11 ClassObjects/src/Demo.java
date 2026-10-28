class Demo{
int p=1;
public void m(int x) {
p=x;
}
public static void main(String[] args) {
Demo d= new Demo();
d.p=3;
System.out.println(d.p);
d.m(4);
System.out.println(d.p);
}
}