<<<<<<< HEAD
#include<iostream>
#include<math.h>
using namespace std;

int power(int b,int e){
   
   if(e==0){
    return 1;
   }else{
    
    return b*power(b,e-1);
   }

}

int main(){
    int b,e;
    cout<<"Enter the number and power:";
    cin>>b>>e;
    int result=power(b,e);
    cout<<b<<"raised to power of "<<e<<" is : "<<result;
    return 0;

=======
#include<iostream>
#include<math.h>
using namespace std;

int power(int b,int e){
   
   if(e==0){
    return 1;
   }else{
    
    return b*power(b,e-1);
   }

}

int main(){
    int b,e;
    cout<<"Enter the number and power:";
    cin>>b>>e;
    int result=power(b,e);
    cout<<b<<"raised to power of "<<e<<" is : "<<result;
    return 0;

>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}