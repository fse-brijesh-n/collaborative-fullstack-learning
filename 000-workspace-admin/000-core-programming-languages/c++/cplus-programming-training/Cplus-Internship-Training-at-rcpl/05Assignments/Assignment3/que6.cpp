#include<iostream>
using namespace std;

int main(){
    int a,b;
    cout<<"Enter a number:";
    cin>>a;
cout<<"Enter b number:";
    cin>>b;
cout<<a<<"<->"<<b<<endl;
  a=a^b;
  b=a^b;
  a=a^b;

  cout<<a<<"<->"<<b;
}