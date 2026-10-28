#include<iostream>
using namespace std; 

int main(){
    int n,m;
    cout<<"Enter the size of row : ";
    cin>>m;
    cout<<"\nEnter the size of column : ";
    cin>>n;

    int arr1[m][n];

    cout<<"\n Set the matrix: ";
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            cin>>arr1[i][j];
        }
    }

    

    cout<<"\n Print  matrix : \n";
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            cout<<" "<<arr1[i][j];
        }
        cout<<"\n";
    }

      //scaller logic
      cout<<"\n Enter the scallar value: ";
      int value;
      cin>>value;
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            arr1[i][j]=value*arr1[i][j];
        }
    }

     cout<<"\n Print  matrix : \n";
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            cout<<" "<<arr1[i][j];
        }
        cout<<"\n";
    }

}