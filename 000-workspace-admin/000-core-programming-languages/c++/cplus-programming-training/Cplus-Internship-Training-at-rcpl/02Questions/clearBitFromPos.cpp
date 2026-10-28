<<<<<<< HEAD
#include<iostream>
#include<bitset>
using namespace std;


int  cbf(int n, int i){
    int mask=((1<<i)-1);
    return n&mask;
}
int main(){
    int n=168;
    int i=6;
    cout << bitset<16>(n)<<endl;
    cout << bitset<16>(1)<<endl;
    cout << bitset<16>(1<<i)<<endl;
    cout << bitset<16>((1<<i)-1)<<endl;
    cout <<"_____________________________"<<endl;

    int result=cbf(n,i);
    cout << bitset<16>(result)<<endl;
    return 0; 
}
=======
#include<iostream>
#include<bitset>
using namespace std;


int  cbf(int n, int i){
    int mask=((1<<i)-1);
    return n&mask;
}
int main(){
    int n=168;
    int i=6;
    cout << bitset<16>(n)<<endl;
    cout << bitset<16>(1)<<endl;
    cout << bitset<16>(1<<i)<<endl;
    cout << bitset<16>((1<<i)-1)<<endl;
    cout <<"_____________________________"<<endl;

    int result=cbf(n,i);
    cout << bitset<16>(result)<<endl;
    return 0; 
}
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
