
#include<iostream>
using namespace std;

class Students{
    string name;
    int age;
    string address;
    
    public:
        void setName(string n){
            name=n;
        }
       
        void setAge(int a){
            age=a;
        }

        void setAddress(string addr){
            address=addr;
        }

        string getName(){
            return name;
        }

        int getAge(){
            return age;
        }

        string getAddress(){
            return address;
        }
};

int main(){
    Students s1;
    Students s2;
    Students *s3=new Students();

    s1.setName("Brijesh Nishad");
    s1.setAge(22);
    s1.setAddress("Greater Noida");

    s2.setName("Kishan Nishad");
    s2.setAge(23);
    s2.setAddress("Greater NOida");

    s3->setName("TCA Admin");
    s3->setAge(23);
    s3->setAddress("Greater NOida");

     cout<<s1.getName()<<endl;
    cout<<s1.getAge()<<endl;
    cout<<s1.getAddress()<<endl;
    cout<<"****************************************************"<<endl;
    cout<<s2.getName()<<endl;
    cout<<s2.getAge()<<endl;
    cout<<s2.getAddress()<<endl;
    cout<<"****************************************************"<<endl;
    cout<<s3->getName()<<endl;
    cout<<s3->getAge()<<endl;
    cout<<s3->getAddress()<<endl;

    return 0;

}