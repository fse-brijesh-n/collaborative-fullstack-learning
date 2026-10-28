#include<iostream>
using namespace std;

public class Employee{
    private:
    string name;
    int age;
    long long salary;
    public:
        
};

 class Manager: public Employee{
    private:
    string designation;
    int bonus;
    public:
    Manager(string name, int age, long long salary, string designation, int bonus){
        Employee::name = name;
        Employee::age = age;
        Employee::salary = salary;
        this->designation = designation;
        this->bonus=bonus;
}
    void show(){
        cout<<"Name: "<<name<<endl;
        cout<<"age:  "<<age<<endl;
        cout<<"salary: "<<salary<<endl;
        cout<<"destination:  "<<designation<<endl;
        cout<<"bonus: "<<bonus<<endl;
       

    }
};

int main(){
    Manager Manager("Rahul", 25, 100000, "Manager",20000);
    Manager.show();
}