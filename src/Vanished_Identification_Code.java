void main()
{
    int[] arr1= {0,1,3,4,5};
    int[] arr2= {1};
    int[] arr3= {0};
    int[] arr4= {8,6,4,2,3,5,7,0,1};
    System.out.println(missing(arr1));
    System.out.println(missing(arr2));
    System.out.println(missing(arr3));
    System.out.println(missing(arr4));
}
int missing(int[] arr)
{
    if(arr.length==0)
        return 0;

    boolean flag= true;
    int max= arr[0];
    for(int val: arr) {
        if(val==0) {
            flag = false;
        }
        if(val>max)
            max= val;
    }
    if(flag)
        return 0;

    int maxSum= (max*(max+1))/2;
    int sum= 0;
    for(int val: arr)
        sum+=val;

    if(maxSum-sum==0)
        return max+1;

    return maxSum-sum;
}