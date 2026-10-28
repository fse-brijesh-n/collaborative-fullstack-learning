//Write a Program to check palindrome string using string functions.
#include<iostream>
#include<string.h>
using namespace std;

int main(){
    char str[100];
    int len, i, flag = 1;
    cout << "Enter a string: ";
    gets(str);
    len=strlen(str);
    for(int i=0; i<=(len/2); i++){
        if(str[i] != str[len-i-1]){
            flag=0;
        }
    }
    flag?cout<<"palimedrome":cout<<"Not polimedrome";
}