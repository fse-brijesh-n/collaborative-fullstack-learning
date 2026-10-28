//. Program to convert string to uppercase using strupr() Function

#include<iostream>
#include<string>
#include<string.h>
using namespace std;

int main(){
    char ch1[100];
    cin>>ch1;
    strupr(ch1);
    cout<<ch1;
}