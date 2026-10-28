#include <iostream>
using namespace std;

class Person {
    string name;
    string dob;
    long long int  mobile;

public:
    
    void setName(string n) {
        name = n;
    }

    string getName() {
        return name;
    }

    void setDob(string age) {
        dob = age;
    }

    string getAge() {
        return dob;
    }

    void setMobile(long long int m) {
        mobile = m;
    }

    long long int  getMobile() {
        return mobile;
    }
};

int main() {

    string name;
    string dob;
    long long int  mobile;
        cout << "Enter name: \n";
        cin >> name;
        cout << "Enter dob:\n ";
        cin >> dob;
        cout << "Enter phone: \n";
        cin >> mobile;
    Person *p=new Person();

    p->setName(name);
    p->setDob(dob);
    p->setMobile(mobile);

    cout << p->getName() << "\n" << p->getAge() << "\n" << p->getMobile() << endl;

    return 0;
}
