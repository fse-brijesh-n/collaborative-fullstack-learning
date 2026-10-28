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
    cout<<endl<<"Remove 1st element\n";
    v1.erase(v1.begin());
    cout<<" Removed the first element \n";
    cout<<"Size of vector after removing 1st element "<<v1.size()<<endl;

    for(int i=0; i<v1.size(); i++){
        cout<<v1[i]<<" ";
    }

    cout<<endl<<"\nRemove from last\n ";

    v1.erase(v1.end()-1);
    cout<<" Removed the last element \n";
cout<<"Size of vector after removing last element "<<v1.size()<<endl;
     for(int i=0; i<v1.size(); i++){
        cout<<v1[i]<<" ";
    }

cout<<"erase the vector";
v1.clear();
cout<<"Size of vector after clearing "<<v1.size()<<endl;
if(v1.size()==0){
    cout<<"No value to traverse the vector";
}else{
     for(int i=0; i<v1.size(); i++){
        cout<<v1[i]<<" ";
    }
}

}