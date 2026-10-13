void main()
{
    int[] arr1= {1,2,3,4,3};
    int[] arr2= {4,5,6,1,2,3};
    System.out.println(integrity(arr1));
    System.out.println(integrity(arr2));
}
public static boolean integrity(int[] arr)
{
    int count= 0;
    for(int i=0; i<arr.length; i++)
    {
        if(arr[i]>arr[(i+1)%arr.length])
            count++;
        if(count>1)
            return false;
    }
    return true;
}