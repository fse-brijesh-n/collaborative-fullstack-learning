#include<iostream>
using namespace std;

int [] digitFrequency(int digit){
    int count[10] ={0};
    while(digit>0){
        int rem=num%10;
        count[rem]++;
        num=num/10;
    }
    return count;
}

int main(){
    int n;
    cout<<"Enter a number to count digits: ";
    cin>>n;
    int *arr=digitFrequency(n)
    for(int i=0; i<10; i++){
        cout<<arr[i];
    }

    return 0;
}