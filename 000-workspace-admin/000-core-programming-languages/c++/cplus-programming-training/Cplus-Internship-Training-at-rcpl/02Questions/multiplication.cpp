<<<<<<< HEAD
#include<iostream>
using namespace std;
int multiply(int n1,int n2){
    if(n1==0 || n2==0){
        return 0;
    }

    return n1+multiply(n1,n2-1);
}

int main(){
    int n1,n2;
cout << "Enter the n1 and n2: ";
cin>>n1>>n2;

int result=multiply(n1,n2);
cout<<"\n "<<n1<<"*"<<n2<<"="<<result;
return 0;
=======
#include<iostream>
using namespace std;
int multiply(int n1,int n2){
    if(n1==0 || n2==0){
        return 0;
    }

    return n1+multiply(n1,n2-1);
}

int main(){
    int n1,n2;
cout << "Enter the n1 and n2: ";
cin>>n1>>n2;

int result=multiply(n1,n2);
cout<<"\n "<<n1<<"*"<<n2<<"="<<result;
return 0;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}