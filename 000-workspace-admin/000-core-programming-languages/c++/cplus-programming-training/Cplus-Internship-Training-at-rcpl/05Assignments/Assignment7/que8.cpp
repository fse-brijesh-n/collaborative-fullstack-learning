#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{ 
    int a;
    printf("enter the number");
    scanf("%d",&a);
    int fact=1;
    for(int i=1;i<=a;i++)
    { 
        fact=fact*i;
    }
    cout<<fact;
}