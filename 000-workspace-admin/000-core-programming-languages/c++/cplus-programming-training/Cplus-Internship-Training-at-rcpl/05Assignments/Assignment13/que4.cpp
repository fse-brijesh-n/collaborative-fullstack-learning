//Program to compare strings using strcmp() function.  

#include<stdio.h>
#include<iostream>
#include<string.h>

using namespace std;

int main(){
    char str1[100];
    printf("Enter a string1 :");
    scanf("%s",str1);
    
    char str2[100];
    printf("\nEnter a string2 :");
    scanf("%s",str2);
    
    if(!strcmp(str1,str2)){
         cout<<"\n"<<str1<<" are equel to "<<str2;
    }else{
        
         cout<<"\n"<<str1<<" are not equel to "<<str2;
    }
    
}