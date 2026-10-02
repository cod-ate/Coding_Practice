void main()
{
    int n= 3;
    char[][] matrix= {{'a','b','c'},
                      {'d','e','f'},
                      {'g','h','i'}};

    for(int i=0; i<n; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            char temp= matrix[i][j];
            matrix[i][j]= matrix[j][i];
            matrix[j][i]= temp;
        }
    }

    for(int i=0; i<n; i++)
    {
        int left= 0, right= n-1;
        while(left<right)
        {
            char temp= matrix[i][left];
            matrix[i][left]= matrix[i][right];
            matrix[i][right]= temp;
            left++; right--;
        }
    }

    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
            System.out.print(matrix[i][j]+" ");
        System.out.println();
    }
}