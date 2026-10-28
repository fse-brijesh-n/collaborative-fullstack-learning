#include<iostream>
using namespace std;

int main(){
    cout<<"Enter year:";
    int year;
    cin>>year;

    (year%4==0 && year%100!=0)?printf("leap year"):(year%400==0)?printf("Leap year"):printf("not leap year");
}