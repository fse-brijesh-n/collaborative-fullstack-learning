#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int> v1;//Growable array 2x
    for(int i=1; i<=10; i++){
        v1.push_back(i);
    }

    for(int i=0; i<10; i++){
        cout<<v1[i]<<" ";
    }
cout<<endl<<"Insert 5 at beginning\n";
v1.insert(v1.begin()+0,5);
cout<<" inserted 5 at beginning\n";
v1.emplace(v1.begin()+3,6);
cout<<"inserted 6 at 4th position\n";

 for(int i=0; i<10; i++){
        cout<<v1[i]<<" ";
    }

}