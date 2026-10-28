#include<iostream>
#include<array>
using namespace std;

int main(){
    array<int, 10> arr = {1, 2, 3, 4,5,6};

    cout<<"Print Array: ";
    for(int i=0; i<5; i++){
        cout<<arr[i]<<" ";
    }

     cout<<"\nPrint Array by at() function: ";
    for(int i=0; i<5; i++){
        cout<<arr.at(i)<<" ";
    }
     cout<<"\nPrint Array by iterator: ";
    for(auto it=arr.begin(); it!=arr.end(); it++){
        cout<<*it<<" ";
    }
    cout<<"\nFirst element: "<<arr.front();
    cout<<"\nBack element: "<<arr.back();
    cout<<"\nArray size : "<<arr.size();
    cout<<"\nArray Max size : "<<arr.max_size();

    array<int , 10> arr2;
    arr.swap(arr2);
    cout<<"\nArray after swap: "<<arr2.at(3);

    cout<<"\ncheck array is empty or not";

    arr.empty()?cout<<"\nArray is empty ":cout<<"\n\nArray not empty";
    return 0;
}

