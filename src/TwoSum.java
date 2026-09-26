void main() {
    int[] arr= {40,25,15,60,35};
    int target= 75;
    getTwoSum(arr,target);
}
void getTwoSum(int[] arr, int target)
{
    int[] result= new int[2];
    result[0]= -1;
    result[1]= -1;
    HashMap<Integer, Integer> map= new HashMap<>();
    for(int i=0; i<arr.length; i++)
    {
        int diff= target-arr[i];
        if(map.containsKey(diff))
        {
            result[0]= i;
            result[1]= map.get(diff);
        }
        map.put(arr[i],i);
    }
    System.out.println(arr[result[0]]+" "+arr[result[1]]);
}