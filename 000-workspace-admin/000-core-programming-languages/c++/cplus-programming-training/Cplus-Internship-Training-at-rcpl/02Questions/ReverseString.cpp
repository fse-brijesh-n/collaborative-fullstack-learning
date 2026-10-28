<<<<<<< HEAD
#include<iostream>

using namespace std;

void reverseString(string &text,int start ,int end){
    if(start>=end){
        return;
    }

    swap(text[start],text[end]);
    reverseString(text,start+1,end-1);

}
int main(){
    string text;
    cout<<"Enter String:"<<endl;
    cin>>text;
    reverseString(text,0,text.length()-1);
    cout<<text;
    return 0;
=======
#include<iostream>

using namespace std;

void reverseString(string &text,int start ,int end){
    if(start>=end){
        return;
    }

    swap(text[start],text[end]);
    reverseString(text,start+1,end-1);

}
int main(){
    string text;
    cout<<"Enter String:"<<endl;
    cin>>text;
    reverseString(text,0,text.length()-1);
    cout<<text;
    return 0;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}