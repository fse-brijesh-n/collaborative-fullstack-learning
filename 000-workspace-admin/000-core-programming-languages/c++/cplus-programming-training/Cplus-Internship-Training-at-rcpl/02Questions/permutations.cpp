<<<<<<< HEAD
#include<iostream>
using namespace std;

 void gPermutation(string text, int start,int last){
        //abc: abc-acb-cab-bac-bca-cba

        if(start==last){
            cout<<text<<"\n";
            return;
        }

        for(int i=start; i<=last; i++){
            swap(text[start],text[i]);
            gPermutation( text,  start+1, last);
            swap(text[start],text[i]);
        }
}
int main(){

    string text;
    cout<<"Enter a string ";
    cin>>text;

    cout<<"All permutation of the string "<<endl;

    gPermutation(text,0,text.length()-1);

    return 0;
=======
#include<iostream>
using namespace std;

 void gPermutation(string text, int start,int last){
        //abc: abc-acb-cab-bac-bca-cba

        if(start==last){
            cout<<text<<"\n";
            return;
        }

        for(int i=start; i<=last; i++){
            swap(text[start],text[i]);
            gPermutation( text,  start+1, last);
            swap(text[start],text[i]);
        }
}
int main(){

    string text;
    cout<<"Enter a string ";
    cin>>text;

    cout<<"All permutation of the string "<<endl;

    gPermutation(text,0,text.length()-1);

    return 0;
>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}