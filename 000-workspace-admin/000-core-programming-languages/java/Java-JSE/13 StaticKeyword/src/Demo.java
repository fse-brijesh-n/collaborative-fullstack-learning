class Demo{
int x=1;
static int y=20;
void show() {
System.out.println(x);
System.out.println(y);
}
}
class ttest{
public static void main(String[] args) {
Demo d1= new Demo();
Demo d2= new Demo();
Demo d3= new Demo();
d1.x=20; d1.y=30;
d2.x=40; d2.y=50;
d3.x=60; d3.y=70;
d1.show();
d2.show();
d3.show();
}
}