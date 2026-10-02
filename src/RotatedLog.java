void main()
{
    int[] arr= {110,118,125,130,101,102,105};
    int key= 101;
    int i= 0, j= arr.length-1;
    while(i<=j)
    {
        int mid= (i+j)/2;
        if(key==arr[mid])
        {
            System.out.println("Found at position: "+(mid+1));
            return;
        }
        if(arr[i]<=arr[mid])
        {
            if(arr[i]<=key && key<arr[mid])
                j= mid-1;
            else
                i= mid+1;
        }
        else
        {
            if(arr[mid]<key && key<=arr[j])
                i= mid+1;
            else
                j= mid-1;
        }
    }
    System.out.println("Not Found!!");
}