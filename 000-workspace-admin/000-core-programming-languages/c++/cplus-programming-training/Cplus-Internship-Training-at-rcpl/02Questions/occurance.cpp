<<<<<<< HEAD
#include<iostream>
using namespace std;

int countOccurence(int arr[],int size, int value){
    
    if(size==0){
         return 0;
    }
    
    if(value==arr[size-1]){
        return 1 +countOccurence( arr, size-1,  value);
    }else{
        return 0+countOccurence( arr, size-1,  value);
    }
     
    }    
   


int main(){
    int n=10;
    int nums[n];
    cout<<"Enter the array :";
    int i,j;
    for(i=0; i<n; i++){
        cin>>nums[i];
    }

    for(j=0; j<n; j++){
        cout<<nums[j]<<' ';
    }

    int element;
    cout<<"\n Enter an element to find the occurence of specific element: ";
    cin>>element;

    int count;
    count=countOccurence(nums,n,element);

    cout<<"Number of occurences of "<<element<<": "<<count;

    return 0;
=======
#include<iostream>
using namespace std;

int countOccurence(int arr[],int size, int value){
    
    if(size==0){
         return 0;
    }
    
    if(value==arr[size-1]){
        return 1 +countOccurence( arr, size-1,  value);
    }else{
        return 0+countOccurence( arr, size-1,  value);
    }
     
    }    
   


int main(){
    int n=10;
    int nums[n];
    cout<<"Enter the array :";
    int i,j;
    for(i=0; i<n; i++){
        cin>>nums[i];
    }

    for(j=0; j<n; j++){
        cout<<nums[j]<<' ';
    }

    int element;
    cout<<"\n Enter an element to find the occurence of specific element: ";
    cin>>element;

    int count;
    count=countOccurence(nums,n,element);

    cout<<"Number of occurences of "<<element<<": "<<count;

    return 0;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}