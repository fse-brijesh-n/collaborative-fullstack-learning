<<<<<<< HEAD
#include<iostream>
#include<bitset>
using namespace std;

int off(int n, int k){
    return n & (~(1<<(k-1)));
}

int on(int n, int k){
     return n | (~(1<<(k-1)));
}
int main(){
    int n=170;
    int k=4;
    int clear=off(n,k);
    int set=on(n,k);
    cout<<"\n"<<bitset<16>(n)<<" = "<<n;
    cout<<"\n"<<bitset<16>(1)<<" = "<<1;
    cout<<"\n"<<bitset<16>(1<<(k-1))<<" = "<<n;
    cout<<"\n"<<bitset<16>(~(1<<(k-1)))<<" = "<<n;
    cout<<"\n"<<bitset<16>(n)<<" -> "<<bitset<16>(clear)<<" --->"<< k<<"th bit of "<<n;
    cout<<"\n"<<bitset<16>(n)<<" -> "<<bitset<16>(set)<<" --->" <<k<<"th bit of "<<n;
    return 0;
=======
#include<iostream>
#include<bitset>
using namespace std;

int off(int n, int k){
    return n & (~(1<<(k-1)));
}

int on(int n, int k){
     return n | (~(1<<(k-1)));
}
int main(){
    int n=170;
    int k=4;
    int clear=off(n,k);
    int set=on(n,k);
    cout<<"\n"<<bitset<16>(n)<<" = "<<n;
    cout<<"\n"<<bitset<16>(1)<<" = "<<1;
    cout<<"\n"<<bitset<16>(1<<(k-1))<<" = "<<n;
    cout<<"\n"<<bitset<16>(~(1<<(k-1)))<<" = "<<n;
    cout<<"\n"<<bitset<16>(n)<<" -> "<<bitset<16>(clear)<<" --->"<< k<<"th bit of "<<n;
    cout<<"\n"<<bitset<16>(n)<<" -> "<<bitset<16>(set)<<" --->" <<k<<"th bit of "<<n;
    return 0;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}