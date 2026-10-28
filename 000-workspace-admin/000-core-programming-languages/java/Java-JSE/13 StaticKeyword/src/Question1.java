class Question1{
static int x;
void m() {
x++;
System.out.println(x);
}
static void setX(int a) {
x=a;
}
}
class Test{
public static void main(String[] args) {
Question1 a= new Question1();
System.out.println(a.x);
a.m();
Question1.setX(15);
a.m();
}
}