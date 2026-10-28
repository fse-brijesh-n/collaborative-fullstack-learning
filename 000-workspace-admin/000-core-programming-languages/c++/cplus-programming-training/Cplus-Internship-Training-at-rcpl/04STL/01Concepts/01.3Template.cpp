#include<iostream>
using namespace std;

// template <typname T, int max>
// or
template <class T>
class Box{
    public:
    Box(T a){
        cout<<"\n a= "<<a
            <<"size of data in bytes"
            <<sizeof(a)
            <<"\n";
    }
};

int main(){
    Box<int> b1(10);
    Box<double> b2(10.5);
    Box<char> b3('B');
}