void main()
{
    int[] arr1= {1,1,1,2,2,3};
    int[] arr2= {-10,-10,-5,-5,-5,-2,-1,-1};
    int[] arr3= {0,1,2,3,4,5};
    int[] arr4= {5,5,5,5,5};
    System.out.println(fragments(arr1));
    System.out.println(fragments(arr2));
    System.out.println(fragments(arr3));
    System.out.println(fragments(arr4));
}
public static int fragments(int[] arr)
{
    if(arr==null || arr.length==0)
        return 0;

    int count= 1;
    for(int i=0; i<arr.length-1; i++)
        if(arr[i]<arr[i+1])
            count++;
    return count;
}