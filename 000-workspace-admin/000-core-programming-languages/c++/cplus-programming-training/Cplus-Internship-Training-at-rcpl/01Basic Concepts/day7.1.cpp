#include<iostream>
using namespace std;

class Store{
    int a;
    int b;
    public :
    void get(){
        cout<<"Enter the value of apple:";
        cin>>a;
        cout<<"Enter the value of banana:";
        cin>>b;
    }

    void display(){
        cout<<"Store of apple:"<<a<<endl;
        cout<<"Store of banana:"<<b<<endl;
    }

    Store operator+(Store &s2){
        Store tempRes;
        tempRes.a=a+s2.a;
        tempRes.b=b+s2.b;
        return tempRes;
    }

    Store operator-(Store &s2){
        Store tempRes;
        tempRes.a=a-s2.a;
        tempRes.b=b-s2.b;
        return tempRes;
    }

    // Constructor to initialize objects
    Store(int x = 0, int y = 0) : a(x), b(y) {}
};

int main(){
    Store s1;
    s1.get();
    Store s2;
    s2.get();
    Store s3 = s1 + s2; 
    s3.display();
    Store s4 = s1 - s2; 
    s4.display();
    return 0;
}