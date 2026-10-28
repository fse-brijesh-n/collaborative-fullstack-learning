<<<<<<< HEAD
#include<iostream>
using namespace std;

int getFib(int n){
    if(n==0){
        return 0;
    }else if(n==1){
        return 1;
    }
    return getFib(n-1)+getFib(n-2);
}
int main(){
   cout<<"fin no:"<<getFib(7);
    return 0;
=======
#include<iostream>
using namespace std;

int getFib(int n){
    if(n==0){
        return 0;
    }else if(n==1){
        return 1;
    }
    return getFib(n-1)+getFib(n-2);
}
int main(){
   cout<<"fin no:"<<getFib(7);
    return 0;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}