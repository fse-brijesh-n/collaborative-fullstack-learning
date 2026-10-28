#include<stdio.h>
#include<stdbool.h>
int main()
{
    int arr[10][10],arr2[10][10];
    int row, col;
    bool isSymmetric = false;
    printf("Enter the rows and columns of matrix: ");
    scanf("%d %d",&row,&col);
    if(row == col)
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                scanf("%d",&arr[i][j]);
            }
        }
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr2[j][i] = arr[i][j]; 
            }
        }

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(arr[i][j] == arr2[i][j])
                {
                    isSymmetric = true;
                }else{
                    isSymmetric = false;
                    break;
                }
            }
            if(isSymmetric == false)
            {
                break;
            }
        }
    }

    isSymmetric ? printf("Symmetric matrix") : printf("not symmetric matrix");

}