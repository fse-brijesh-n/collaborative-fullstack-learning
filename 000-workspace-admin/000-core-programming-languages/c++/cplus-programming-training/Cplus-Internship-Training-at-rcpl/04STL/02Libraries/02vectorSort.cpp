#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    int myInts[]={11,23,45,67,89};
    vector<int> v(myInts,myInts+sizeof(myInts)/sizeof(myInts[0]));
   
    sort(v.begin(),v.end());
   

    for(int i=0; i<v.size(); i++){
        cout<<v[i]<<" ";
    }
   cout<<endl;
  
    return 0;
}