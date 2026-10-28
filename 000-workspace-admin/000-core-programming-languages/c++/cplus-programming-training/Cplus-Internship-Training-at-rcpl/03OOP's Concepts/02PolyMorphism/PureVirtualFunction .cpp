#include <iostream>
using namespace std;

class Parent {
public:
    virtual void show() = 0; // Pure virtual function
};

class ChildA : public Parent {
public:
    void show() override {
        cout << "show is the newest version via ChildA of parent\n";
    }
};

class ChildB : public Parent {
public:
    void show() override {
        cout << "show is the newest version via ChildB of parent\n";
    }
};

int main() {
    Parent *p = nullptr;
    int choice;

    // User choice for which child class to instantiate
    cout << "Enter 1 for ChildA or 2 for ChildB: ";
    cin >> choice;

    switch (choice) {
        case 1:
            p = new ChildA();
            break;
        case 2:
            p = new ChildB();
            break;
        default:
            cout << "Invalid choice!" << endl;
            return 1; // Exit with error code
    }

    // Use the pointer to call the show function
    p->show();

    // Clean up
    delete p;
    return 0;
}
