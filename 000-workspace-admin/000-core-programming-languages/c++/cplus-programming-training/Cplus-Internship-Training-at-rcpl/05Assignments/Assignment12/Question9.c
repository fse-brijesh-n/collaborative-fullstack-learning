#include<stdio.h>
#include<stdbool.h>
int main()
{
    int arr[10][10],arr2[10][10];
    int row, col, count=0;
    bool isIdentityMatrix = false;
    printf("Enter the rows and columns of matrix: ");
    scanf("%d %d",&row,&col);
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
            if(arr[i][j]==0)
            {
                count ++;
            }
        }
    }
    int non_zero = (row*col)-count;
    (count > non_zero) ? printf("Sparse matrix") : printf("not a sparse matrix");
}