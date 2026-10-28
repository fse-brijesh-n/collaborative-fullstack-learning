#include <iostream>
using namespace std;

class Parent {
public:
    virtual void show() { // Method to be overridden
        cout << "show() in Parent\n";
    }

    void display() { // Method to be hidden
        cout << "display() in Parent\n";
    }
};

class Child : public Parent {
public:
    void show() override { // Method overriding
        cout << "show() in Child\n";
    }

    // Method hiding (not polymorphic)
    void display(int x) {
        cout << "display(int x) in Child with value: " << x << "\n";
    }
};

int main() {
    Parent *p = new Child();

    // Method overriding in action
    p->show(); // Calls Child's show() method because it's overridden

    // Method hiding in action
    // p->display(); // This would call Parent's display() method if present, but it won't compile as there's no matching signature

    // Use Child's specific method
    Child *c = new Child();
    c->display(10); // Calls Child's display(int x) method

    // Clean up
    delete p;
    delete c;
    return 0;
}
