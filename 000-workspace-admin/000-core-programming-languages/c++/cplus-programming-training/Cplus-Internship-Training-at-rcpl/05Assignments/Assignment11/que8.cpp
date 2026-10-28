#include<iostream>
using namespace std;

int main(){
    int i,j,n,sum=0;
    cout<<"Enter the size of the matrix: ";
    cin>>n;
    int matrix[n][n];
    cout<<"Enter the element of matrix :\n";
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            cin>>matrix[i][j];

    }
   }

   cout<<"Eelement of matrix :\n";
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            cout<<matrix[i][j];

    }
    cout<<"\n";
   }

    cout<<"Enter the element of matrix :\n";
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
           if(i==j){
            sum=sum+matrix[i][j];
           }

    }
   }

   cout<<"sum of diagonal: "<<sum;
}