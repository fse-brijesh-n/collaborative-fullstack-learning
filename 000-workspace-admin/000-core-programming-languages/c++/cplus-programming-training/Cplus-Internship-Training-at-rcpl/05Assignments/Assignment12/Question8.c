#include<stdio.h>
#include<stdbool.h>
int main()
{
    int arr[10][10],arr2[10][10];
    int row, col;
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
    if(row == col)
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(i==j)
                {
                    if(arr[i][j] != 1)
                    {
                        isIdentityMatrix = false;
                        break;
                    }else{
                        isIdentityMatrix = true;
                    }
                }else{
                    if(arr[i][j] != 0)
                    {
                        isIdentityMatrix = false;
                        break;
                    }else{
                        isIdentityMatrix = true;
                    }
                }
            }
            if(isIdentityMatrix == false)
            {
                break;
            }
        }
    }
    if(isIdentityMatrix)
    {
        printf("identity matrix");
    }else{
        printf("not identity matrix");
    }
}