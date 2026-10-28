#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"enter the size of the array\n";
    cin>>n;
    int *arr=new int[n];

    cout<<"Enter the aray value: ";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    cout<<"Entered value: ";
    for(int i=0; i<n; i++){
        cout<<" "<<arr[i];
    }
int even_count=0;
int odd_count=0;
cout<<endl;
    for(int i=0; i<n; i++){
        if(arr[i]%2==0){
            even_count++;     
        }else{
            odd_count++;
        }
    }
int *even=new int[even_count];
int *odd=new int[odd_count];

 for(int i=0,  x=0, y=0; i<n; i++){
        if(arr[i]%2==0){
            even[x++]=arr[i];     
        }else{
            odd[y++]=arr[i];
        }
    }
cout<<"\n";
cout<<"Even numbers: ";

for(int i=0; i<even_count; i++){
    cout<<" "<<even[i];
}
cout<<"\n";
cout<<"Odd numbers: ";

for(int i=0; i<odd_count; i++){
    cout<<" "<<odd[i];
}
    cout<<"\nEven count: "<<even_count<<"\n"<<"Odd count : "<<odd_count;
}