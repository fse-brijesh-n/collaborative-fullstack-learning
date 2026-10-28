#include<iostream>
using namespace std;


class Student{
    private : int marks;
    public:
        void input()
        {
            cout<<"Enter marks:";
            cin>>marks;
        }
        void output()
        {
            cout<<"Enterd marks: ";
            cout<<marks<<endl;
        }
    friend void graceMarks(int m);
};

Student s1;

 void graceMarks(int m)
 {
         s1.marks=s1.marks+m;
}

int main(){

    s1.input();
    s1.output();
    graceMarks(2);
    s1.output();
    return 0;
}
