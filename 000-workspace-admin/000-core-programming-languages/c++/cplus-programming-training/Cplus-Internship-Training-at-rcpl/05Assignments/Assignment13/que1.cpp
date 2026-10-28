//Q1. Program to find length of string using strlen() string function.
#include<iostream>
#include<string>
#include<string.h>
using namespace std;

int main(){
    string str;
    cout<<"Enter a string1: ";
    getline(cin,str);
    char s2[100];
    cout<<"Enter a string2: ";
    scanf("%s",s2);
    int len=strlen(s2);
    cout<<"Length of string1 is: "<<str.length()<<endl;
    cout<<"Length of string2 is: "<<len<<endl;
}