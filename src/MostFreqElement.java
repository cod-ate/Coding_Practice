void main()
{
    int[] arr= {101,102,101,103,102,101,104};
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int val: arr)
        map.put(val, map.getOrDefault(val, 0) + 1);

    int maxFreq= 0;
    int key= -1;
    for(Map.Entry<Integer,Integer> entry: map.entrySet())
    {
        if(entry.getValue()>maxFreq)
        {
            maxFreq= entry.getValue();
            key= entry.getKey();
        }
    }
    System.out.println(key);
}