//Q2. Program to concatenate two strings using strcat() function. 

#include<iostream>
#include<string.h>
#include<string>
using namespace std;
int main(){
    char str1[100], str2[100];
    cout<<"Enter first string: ";
    cin>>str1;
    cout<<"Enter second string: ";
    cin>>str2;

    strcat(str1,str2);

    cout<<str1;



    
}