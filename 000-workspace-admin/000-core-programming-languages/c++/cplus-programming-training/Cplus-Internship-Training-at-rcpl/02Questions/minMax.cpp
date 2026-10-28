<<<<<<< HEAD
#include<iostream>

using namespace std;
int findMAx(int arr[], int start ,int end ){
    if(start==end){
        return arr[start];
    }

    //devide and concor approach 

    int mid = (start+end)/2;
    int max1=findMAx(arr, start,mid);
    int max2=findMAx(arr, mid+1,end);
    return (max1>max2)?max1:max2;
}

int findMIn(int arr[], int start, int end){
    if(start==end){
        return arr[start];
    }

    //devide and concor approach

    int mid = (start+end)/2;

    int min1=findMIn(arr,start,mid);
    int min2=findMIn(arr,mid+1,end);
     return (min1<min2)?min1:min2;
}

int main(){
    int arr[]={12,3,4,5,58,34,67,65};
    cout<<findMAx(arr,0,7)<<endl;
     cout<<findMIn(arr,0,7);
     return 0;
=======
#include<iostream>

using namespace std;
int findMAx(int arr[], int start ,int end ){
    if(start==end){
        return arr[start];
    }

    //devide and concor approach 

    int mid = (start+end)/2;
    int max1=findMAx(arr, start,mid);
    int max2=findMAx(arr, mid+1,end);
    return (max1>max2)?max1:max2;
}

int findMIn(int arr[], int start, int end){
    if(start==end){
        return arr[start];
    }

    //devide and concor approach

    int mid = (start+end)/2;

    int min1=findMIn(arr,start,mid);
    int min2=findMIn(arr,mid+1,end);
     return (min1<min2)?min1:min2;
}

int main(){
    int arr[]={12,3,4,5,58,34,67,65};
    cout<<findMAx(arr,0,7)<<endl;
     cout<<findMIn(arr,0,7);
     return 0;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}