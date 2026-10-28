//Q3. Program to copy string using strcpy() function.
#include<iostream>
#include<string.h>
using namespace std;

int main(){
    char str1[100];
    printf("Enter a string1 :");
    scanf("%s",str1);
    cout<<str1<<endl;
    char str2[100];
    printf("\nEnter a string2 :");
    scanf("%s",str2);
    cout<<str2<<endl;
    strcpy(str1,str2);
    cout<<str1;
}