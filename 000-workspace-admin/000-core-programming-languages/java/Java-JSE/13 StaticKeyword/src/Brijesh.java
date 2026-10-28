class Brijesh{
static int x;
static void m() {
x++;
}
static void show() {
System.out.println(x);
}
}
class nishad{
public static void main(String[] args) {
System.out.println(Brijesh.x);
Brijesh.m();
Brijesh.m();
Brijesh.show();
}
}