#include<iostream>
using namespace std;

int main(){
    int a ;
     cout<<"Enter a number for absolute value:";

     cin>>a;
     (a>=0)?(a==0)?printf("zero"):printf("Positive"):printf("MOD value of %d",a*(-1));
}