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

 
    // Compute and print row sums
    cout << "Row sums of matrix:" << endl;
    for (int i = 0; i < n; i++) {
        int rowSum = 0;
        for (int j = 0; j < n; j++) {
            rowSum += matrix[i][j];
        }
        cout << "Row " << i << ": " << rowSum << endl;
    }

    // Compute and print column sums
    cout << "Column sums of matrix:" << endl;
    for (int j = 0; j < n; j++) {
        int colSum = 0;
        for (int i = 0; i < n; i++) {
            colSum += matrix[i][j];
        }
        cout << "Column " << j << ": " << colSum << endl;
    }

    return 0;
} 