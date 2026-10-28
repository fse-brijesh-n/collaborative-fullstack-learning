//Rotate the array

#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the size of array:";
    cin>>n;
    int *arr=new int[n];
    cout<<"Enter array elements: ";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    cout<<"Array elements are: ";
    for(int i=0; i<n; i++){
        cout<<" "<<arr[i];
    }
    cout<<"\nrotation times:\n";
    int d;
    cin>>d;
    d=d%n;
    for(int i=0; i<d; i++){
        int temp = arr[0];
        for(int j=0; j<n-1; j++){
            arr[j] = arr[j+1];
        }
        arr[n-1]=temp;
    }

    cout<<"After rotate the array: ";
  
    for(int i=0; i<n; i++){
        cout<<" "<<arr[i];
    }
    delete[] arr; // Don't forget to free the memory
    return 0;
}

