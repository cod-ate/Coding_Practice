void main()
{
    int n= 9898;
    while(n>9)
    {
        int sum= 0;
        while(n!=0)
        {
            sum= sum+n%10;
            n= n/10;
        }
        n= sum;
    }
    System.out.println(n);
}