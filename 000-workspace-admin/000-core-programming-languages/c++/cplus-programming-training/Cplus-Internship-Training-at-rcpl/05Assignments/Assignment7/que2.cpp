#include<iostream>
#include<string.h>
using namespace std;
int main(){
    long long int num;
    cout<<"enter a number: ";
    cin>>num;
    cout<<num<<endl;
    long long int temp=num;
    long long int reversed=0;
    int i=0;
    while(num!=0){
        int rem=num%10;
        num=num/10;
       reversed=reversed*10+rem;
    }
    cout<<reversed<<endl;
    if(reversed==temp){
        cout<<"palindrome"<<endl;
    }else{
        cout<<"not palindrome"<<endl;
    }
}