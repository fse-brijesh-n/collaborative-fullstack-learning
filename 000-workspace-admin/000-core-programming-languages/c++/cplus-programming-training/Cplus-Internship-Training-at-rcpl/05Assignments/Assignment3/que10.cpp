#include<iostream>
using namespace std;

int main(){
    cout<<"Enter character:";
    int ch,range,low,high;
    cin>>ch>>low>>high;

   (ch>=low && ch<=high)?printf("in range"):printf("out of range");
}