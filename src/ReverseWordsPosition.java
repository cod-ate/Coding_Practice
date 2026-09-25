void main()
{
    String s= "hello world by cod-ate";
    String[] str= s.split("\\s");

    int i=0, j=str.length-1;
    while(i<j)
    {
        String temp= str[i];
        str[i]= str[j];
        str[j]= temp;
        i++; j--;
    }
    for(String val: str)
        System.out.print(val+" ");
}