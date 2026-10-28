#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{ 
    int a;
    printf("enter the number");
    scanf("%d",&a);
    for(int i=1;i<=a;i++)
    { 
        if(a%i==0)
          printf("%d \n",i);
    }
}