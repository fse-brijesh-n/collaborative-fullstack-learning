#include<iostream>
using namespace std; 

int main(){
    int n,m;
    cout<<"Enter the size of row : ";
    cin>>m;
    cout<<"\nEnter the size of column : ";
    cin>>n;

    int matrix1[m][n];

    cout<<"\n Set the matrix1: ";
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            cin>>matrix1[i][j];
        }
    }

    

    cout<<"\n Print  matrix1 : \n";
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            cout<<" "<<matrix1[i][j];
        }
        cout<<"\n";
    }


    int matrix2[m][n];

    cout<<"\n Set the matrix2: ";
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            cin>>matrix2[i][j];
        }
    }

    

    cout<<"\n Print  matrix2 : \n";
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            cout<<" "<<matrix2[i][j];
        }
        cout<<"\n";
    }

      //multiplication logic
     int result[m][n];
     for(int i=0; i<n;i++){
        for(int j=0; j<m;j++){
            result[i][j]=0;
        }
     }

      
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            int sum=0;
            for(int k=0; k<m; k++){
                    //main logic i>row, j>col
                   sum=sum+(matrix1[i][k]*matrix2[k][j]);
            }
          result[i][j]=sum;
        }
       
    }

     cout<<"\n Print result matrix : \n";
    for(int i =0 ; i<n; i++){
        for(int j=0; j<m; j++){
            cout<<" "<<result[i][j];
        }
        cout<<"\n";
    }

}