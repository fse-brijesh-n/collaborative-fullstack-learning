#include<stdio.h>
int main()
{
    int i,j,rows,cols;
    int arr[10][10];
    printf("Enter the number of rows and columns: ");
    scanf("%d %d",&rows,&cols);
    printf("\nEnter the matrix elements : \n");
    for(i=0; i<rows; i++)
    {
        for(j=0; j<cols; j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }

    if(rows == cols)
    {
        for(int i=0; i<rows; i++)
        {   
            int temp = arr[i][i];
            arr[i][i] = arr[i][rows-i-1];
            arr[i][rows-i-1] = temp;
        }
    }

    printf("Matrix elements after interchanging diagonals: \n");
    for(int i=0; i<rows; i++)
    {
        for(int j=0; j<cols; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}