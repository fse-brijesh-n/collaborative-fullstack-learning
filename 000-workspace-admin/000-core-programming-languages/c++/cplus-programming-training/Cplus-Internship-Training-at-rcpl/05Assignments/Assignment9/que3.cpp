#include<iostream>
using namespace std; 

int main(){
    cout<<"Enter the size of an array"<<endl;
    int n;
    cin>>n;
    // int *arr=(int*)calloc(n,sizeof(int));
    int *arr=new int[n];

    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    cout<<"\n";
    int sum=0;
    for(int i=0; i<n; i++){
       sum+=arr[i];
        }
    cout<<sum;
        
}
