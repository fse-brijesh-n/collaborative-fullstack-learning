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
            cout<<" "<<arr[i];
        }
    
    
int max=arr[0];
int secMax=arr[0];
int thirdMax=arr[0];

for(int i=0; i<n; i++){
    if(arr[i]>max){
        max=arr[i];
}

}
for(int i=0; i<n; i++){
    if(arr[i]>secMax && arr[i]<max){
        secMax=arr[i];
}

for(int i=0; i<n; i++){
    if(arr[i]<secMax && arr[i]>thirdMax && arr[i<max]){
        thirdMax=arr[i];
}

}
  
}
cout<<"\n Third Maximum: "<<thirdMax;      
}
