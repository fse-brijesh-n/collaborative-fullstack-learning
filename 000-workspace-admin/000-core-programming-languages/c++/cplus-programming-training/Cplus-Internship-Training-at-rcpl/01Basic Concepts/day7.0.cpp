#include <iostream>
using namespace std;

class Test {
public:
    int a, b;

    // Default constructor
    Test() {
        a = 100;
        b = 100;
        cout << "Default constructor\n";
    }

    // Parameterized constructor
    Test(int a_val, int b_val) {
        a = a_val;
        b = b_val;
        cout << "Parameterized constructor\n";
    }

    // Copy constructor
    Test(const Test &t) {
        a = t.a;
        b = t.b;
        cout << "Copy constructor\n";
    }

    // Destructor
    ~Test() {
        cout << "Destructor called\n";
    }

    Test(string a){
        cout<<"a";
    }
};
Test objc("C");
void show(){
    cout<<"show function started..."<<endl;
    Test obja("A");
    cout<<"show function completed..."<<endl;
}
int main() {
    show();
    cout<<"main() started...."<<endl;
    Test obj1; // Calls default constructor
    Test obj2(200, 200); // Calls parameterized constructor

    Test obj3 = obj2; // Calls copy constructor

    cout << "\nobj3.a = " << obj3.a << endl;
    cout << "obj3.b = " << obj3.b << endl;

    Test obj4; // Calls default constructor
    obj4 = obj2; // Calls copy constructor (and copy assignment operator)

    cout << "\nobj4.a = " << obj4.a << endl;
    cout << "obj4.b = " << obj4.b << endl;
    cout<<"main() completed"<<endl;

    return 0;
}
