<<<<<<< HEAD
#include<iostream>
#include<bitset>
using namespace std;

int main(){
    
    cout<<"8= "<<bitset<8>(8)<<endl;
    cout<<"7= "<<bitset<8>(7)<<endl<<endl<<endl;
    cout<<"43= "<<bitset<8>(43)<<endl<<endl<<endl;
    cout<<"248= "<<bitset<8>(248)<<endl<<endl<<endl;
    cout<<"247= "<<bitset<16>(247)<<endl<<endl<<endl;

    int n=172;
    bitset<16> a(n);
    bitset<16> b(n-1);
    bitset<16> c=~b;
    bitset<16> extractLSB=c&a;
    cout<<extractLSB<<endl;

    return 0;
=======
#include<iostream>
#include<bitset>
using namespace std;

int main(){
    
    cout<<"8= "<<bitset<8>(8)<<endl;
    cout<<"7= "<<bitset<8>(7)<<endl<<endl<<endl;
    cout<<"43= "<<bitset<8>(43)<<endl<<endl<<endl;
    cout<<"248= "<<bitset<8>(248)<<endl<<endl<<endl;
    cout<<"247= "<<bitset<16>(247)<<endl<<endl<<endl;

    int n=172;
    bitset<16> a(n);
    bitset<16> b(n-1);
    bitset<16> c=~b;
    bitset<16> extractLSB=c&a;
    cout<<extractLSB<<endl;

    return 0;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}