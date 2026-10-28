#include<iostream>
using namespace std;

class User{
    private:
    string name;
    int age;
    long long phone;
    string address;
    string email;
    public:
    // Getter methods
    string getName() { return name; }
    int getAge() { return age; }
    long long getPhone() { return phone; }
    string getAddress() { return address; }
    string getEmail() { return email; }

    // Setter methods
    void setName(string n) { name = n; }
    void setAge(int a) { age = a; }
    void setPhone(long long p) { phone = p; }
    void setAddress(string addr) { address = addr; }
    void setEmail(string e) { email = e; }
};

int main(){
    User *u1=new User();
    u1->setName("John");
    u1->setAge(25);
    u1->setPhone(1234567890);
    u1->setAddress("123 Main St");
    u1->setEmail("john@example.com");

   cout<< u1->getName();
   cout<<"\n";
   cout<< u1->getAge();
   cout<<"\n";
   cout<< u1->getPhone();
   cout<<"\n";
   cout<< u1->getAddress();
   cout<<"\n";
   cout<< u1->getEmail();
   cout<<"\n";
   

    return 0;


}