<<<<<<< HEAD
#include<iostream>

int getSumOfDigit(int n){
    if(n>=0 && n<=9){
        return n;
    }

    return (n%10)+getSumOfDigit(n/10);
}

int main(){
    std:: cout<<getSumOfDigit(1324);
    return 0;
} 
=======
#include<iostream>

int getSumOfDigit(int n){
    if(n>=0 && n<=9){
        return n;
    }

    return (n%10)+getSumOfDigit(n/10);
}

int main(){
    std:: cout<<getSumOfDigit(1324);
    return 0;
} 
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
