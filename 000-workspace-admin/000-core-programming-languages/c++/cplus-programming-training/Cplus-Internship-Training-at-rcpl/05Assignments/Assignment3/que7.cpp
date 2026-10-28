#include<iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter a number:";
    cin>>num;

    int a1=num/1000;
    int a2=(num%1000)/100;
    int a3=(num%100)/10;
    int a4=num%10;

    cout<<a1<<","<<a2<<","<<a3<<","<<a4;
}