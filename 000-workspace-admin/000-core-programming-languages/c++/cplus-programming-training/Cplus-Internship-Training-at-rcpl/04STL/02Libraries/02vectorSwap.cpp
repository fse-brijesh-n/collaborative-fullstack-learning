#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int> v1={11,23,45,67,89};
    vector<int> v2={23,3,43,2,1};
    
   

    for(int i=0; i<v1.size(); i++){
        cout<<v1[i]<<" ";
    }
   cout<<endl;
   for(int i=0; i<v2.size(); i++){
        cout<<v2[i]<<" ";
    }
   cout<<endl;
   //swap
   cout<<"\n"<<v1.at(3);
   v1.swap(v2);
   cout<<"\n"<<v1.at(3);
}