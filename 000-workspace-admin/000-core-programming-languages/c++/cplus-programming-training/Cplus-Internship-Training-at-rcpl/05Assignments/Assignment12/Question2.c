#include<stdio.h>
int main()
{
    int rows,cols;
    int arr[10][10];
    printf("Enter the number of rows and columns: ");
    scanf("%d %d",&rows,&cols);
    printf("\nEnter the matrix elements : \n");
    for(int i=0; i<rows; i++)
    {
        for(int j=0; j<cols; j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }

    if(rows == cols)
    {
        printf("\nupper triangular matrix : \n");
        for(int i=0; i<rows; i++)
        {   
            for(int j=0; j<cols; j++)
            {
                if(i<=j)
                {
                    printf("%d ",arr[i][j]);
                }else{
                    printf("  ");
                }
            }
            printf("\n");
        }
    }
}