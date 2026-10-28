#include<iostream>
using namespace std;
int main(){
    long long int num=9506563150;
    cout<<num<<endl;

    while(num!=0){
        int rem=num%10;
        num=num/10;
        cout<<rem;
    }
}