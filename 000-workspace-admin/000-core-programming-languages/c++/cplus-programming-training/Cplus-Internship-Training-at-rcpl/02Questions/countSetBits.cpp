<<<<<<< HEAD
//brian Kernighan's algorithm

#include<iostream>
using namespace std;

// int countSetBits(int x){
//     int count=0;
//     while(x){
//         x=x&(x-1);//off the lsb bit
//         count++;
//     }
//     return count;
// }

int countSetBits(int x){
    if(x == 0){
        return 0;
    }

    int lastBit = x & 1;
    if(lastBit==1){
        return 1+ countSetBits(x>>1);
    }else{
        return countSetBits(x>>1);
    }
    
}
int main(){
    int n=127;

    // int rs=n<<2;//right shift
    // int ls=n>>2;//left shift

    // cout<<rs<<endl;
    // cout<<ls<<endl;

    cout<<countSetBits(n)<<endl;
=======
//brian Kernighan's algorithm

#include<iostream>
using namespace std;

// int countSetBits(int x){
//     int count=0;
//     while(x){
//         x=x&(x-1);//off the lsb bit
//         count++;
//     }
//     return count;
// }

int countSetBits(int x){
    if(x == 0){
        return 0;
    }

    int lastBit = x & 1;
    if(lastBit==1){
        return 1+ countSetBits(x>>1);
    }else{
        return countSetBits(x>>1);
    }
    
}
int main(){
    int n=127;

    // int rs=n<<2;//right shift
    // int ls=n>>2;//left shift

    // cout<<rs<<endl;
    // cout<<ls<<endl;

    cout<<countSetBits(n)<<endl;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}