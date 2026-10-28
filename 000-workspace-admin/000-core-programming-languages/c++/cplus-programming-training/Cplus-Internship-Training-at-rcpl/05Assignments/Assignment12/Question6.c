#include<stdio.h>
int main()
{
    int arr[10][10],arr2[10][10];
    int row, col;
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
            arr2[j][i] = arr[i][j]; 
        }
    }

    printf("transpose of matrix is : \n");
    for(int i=0; i<col; i++)
    {
        for(int j=0; j<row; j++)
        {
            printf("%d ", arr2[i][j]);
        }
        printf("\n");
    }
}