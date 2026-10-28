#include<iostream>
using namespace std;



template <typename T>
T myMax(T x, T y){
    return (x>y)? x : y;
}

int main(){
    cout<<myMax<int>(5,6)<<endl;
    cout<<myMax<float>(3.4,6.7)<<endl;
    cout<<myMax<char>('x','X')<<endl;
    return 0;
}