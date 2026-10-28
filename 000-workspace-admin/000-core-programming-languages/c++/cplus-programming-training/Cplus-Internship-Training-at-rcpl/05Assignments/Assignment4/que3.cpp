#include<iostream>
using namespace std;

int main(){
    cout<<"Enter character:";
    char ch;
    cin>>ch;

   ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?printf("Alphabet")
   :(ch>='0' && ch<='9')?printf("Digit")
   :printf("Special charactoer");
   
}


