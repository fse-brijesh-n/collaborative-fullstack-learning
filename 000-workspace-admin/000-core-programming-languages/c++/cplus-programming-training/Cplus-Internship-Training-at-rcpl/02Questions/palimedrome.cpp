<<<<<<< HEAD
#include<iostream>
using namespace std;

bool isPalindrome(const string &text,int start ,int end){
      if(start>=end){
        return true;
    }
     if(text[start] != text[end]){
        return false;
     }
    return isPalindrome(text,start+1,end-1);

}


int main(){
    string text;
    cout<<"Enter a string : ";
    cin>>text;

    bool palindrome=isPalindrome(text,0,text.length());

    if(palindrome)
        cout<<"String is palindrome\n";
    else
        cout<<"NOt a polindrome";

    return 0;

=======
#include<iostream>
using namespace std;

bool isPalindrome(const string &text,int start ,int end){
      if(start>=end){
        return true;
    }
     if(text[start] != text[end]){
        return false;
     }
    return isPalindrome(text,start+1,end-1);

}


int main(){
    string text;
    cout<<"Enter a string : ";
    cin>>text;

    bool palindrome=isPalindrome(text,0,text.length());

    if(palindrome)
        cout<<"String is palindrome\n";
    else
        cout<<"NOt a polindrome";

    return 0;

>>>>>>> aacc2cfb0fc9a0c2ea14e4955d849ee9e12412d5
}