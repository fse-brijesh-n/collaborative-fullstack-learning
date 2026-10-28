#include<iostream>
using namespace std;

class Parent_spell_checker{
protected:
    int age;
    string name;
};

class Child_powerpoint : public Parent_spell_checker {
   long long int phone;
   string course;
public:
   Child_powerpoint(long long int phone, string course, int age, string name){
       this->phone = phone;
       this->course = course;
       Parent_spell_checker::age = age;
       Parent_spell_checker::name = name;
   }

   void show(){
       cout << phone << " " << course << " " << age << " " << name << endl;
   }
};

int main() {
    Child_powerpoint Child_powerpoint(1234567890, "C++", 20, "John Doe");
    Child_powerpoint.show();
    return 0;
}