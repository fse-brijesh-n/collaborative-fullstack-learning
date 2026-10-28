#include<iostream>
#include<stdio.h>
using namespace std;

int findHCF(int a, int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}

int hcf(int a, int b){
    for(int i=1; i<a; && i<=b; ++i){
        if(a%i==0 && b%i==0){
            gcd=i;
        }

        return gcd
    }
}
int findLCM(int a, int b) {
    return (a * b) / findHCF(a, b);
}

int main()
{ 
    int a,b;
    printf("enter the number\n");
    scanf("%d",&a);
    printf("enter the number\n");
    scanf("%d",&b);
    // inside main function
    int hcf = findHCF(a, b);
  int  lsm=findLCM(a,b);   
    int lcm=findLCM(a,b)
    cout<<g<<endl;
    printf("HCF: %d\n", hcf);
    printf("LCM: %d\n", lcm);
 
}