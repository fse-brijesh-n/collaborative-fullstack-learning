#include<iostream>
using namespace std;

class Variables {
    int a;
    float b;
    char c;

public:
    void setData(int x, float y, char z) {
        a = x;
        b = y;
        c = z;
    }

    void Display() {
        printf("a=%d\n", a);
        printf("b=%f\n", b);
        printf("c=%c\n", c);
    }
};

int main() {
    Variables v;
    int a;
    float b;
    char c;

    printf("Enter an integer: ");
    scanf("%d", &a);
    printf("Enter a float: ");
    scanf("%f", &b);

    // Consume the newline character left in the input buffer after reading float
    while (getchar() != '\n');

    printf("Enter a character: ");
    scanf("%c", &c);

    v.setData(a, b, c);
    v.Display();

    return 0;
}
