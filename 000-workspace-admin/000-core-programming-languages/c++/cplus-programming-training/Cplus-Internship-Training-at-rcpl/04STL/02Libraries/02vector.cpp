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
//even number sum 
    int total=0;
    for(int i=0; i<=v1.size()-1; i++){
        int rem = v1[i]%2;
        if(rem==0){
            total+=v1[i];
        }
    }
    cout<<endl<<"sum of even numbers : "<<total<<endl;

// print odd number with squire
int odd=1;
cout<<"-----------------odd------------------- "<<endl;
    for(int i=0; i<=v1.size()-1; i++){
        int rem = v1[i]%2;
        if(rem!=0){
            odd=v1[i]*v1[i];
            cout<<v1[i]<<" : "<<odd<<endl;
        }
    }
//pointer to 

int *pos;
pos=v1.data();
cout<<"\nFirst element is " <<*pos<<"\n";
pos=pos+1;
cout<<"\nSecond element is " <<*pos<<"\n";
pos=pos+1;
cout<<"\nThird element is " <<*pos<<"\n";
pos=pos+1;
cout<<"\nFourth element is " <<*pos<<"\n";

cout<<" print vector with data() pointer \n";
int *getBase=v1.data();
for(int i=0; i<v1.size(); i++){
    cout<<*(getBase)<<" ";
    getBase++;
}
cout<<"\n\n";
//new vector v2 
vector<int> v2;//Growable array 2x
    for(int i=1; i<=5; i++){
        v2.push_back(i);
    }

    for(int i=0; i<5; i++){
        cout<<v2[i]<<" ";
    }
    cout<<"\n";
cout<<"\nEnter 5 data more in v2: ";
int value;
for(int i=1; i<=5; i++){
    cin>>value;
    v2.push_back(value);
}
for(int i=0; i<10; i++){
        cout<<v2[i]<<" ";
    }
    cout<<"\n";

}