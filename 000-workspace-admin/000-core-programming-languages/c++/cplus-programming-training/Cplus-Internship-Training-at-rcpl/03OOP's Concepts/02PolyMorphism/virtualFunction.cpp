#include<iostream>
using namespace std;
//Method Overriding using virtual keyword and work in only heap memoery not in stack memoery
class Parent{
    public :
      virtual void show(){
        cout<<"Alto : show() of Parent \n";
    }
};

class ChildA : public Parent {
    public: 
      void show(){
            cout<<"show is the newest version via ChildA\n";
        }
};

int main(){
   Parent *p1=NULL;
   Parent *p2=NULL;
   ChildA *ch1=NULL;
   p1=new Parent();
   p1->show();
   p2=new Parent();
   p2->show();

   ch1=new ChildA();
   ch1->show();
   


    return 0;
}