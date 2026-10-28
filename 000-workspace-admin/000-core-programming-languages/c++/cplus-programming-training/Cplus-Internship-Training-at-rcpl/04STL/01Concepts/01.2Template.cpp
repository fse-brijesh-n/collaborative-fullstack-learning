#include<iostream>
using namespace std;

// template <typname T, int max>
// or
template <class T, int max>
int arrMin(T arr[], int n){
    int m=max;
    for(int i=0; i<n; i++){
        if(arr[i]<m){
            m=arr[i];
        }
    }
    return m;
}

int main(){
    int arr[] = {5, 2, 9, 6, 3};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << arrMin<int ,10000>(arr, n) << endl;
}