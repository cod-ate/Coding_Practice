//  Prime Range Report – Gate Access Audit

void main()
{
    int l= 10, r= 30;
    int count= 0;
    int max= -1;
    for(int i=l; i<=r; i++)
    {
        if(i<=1)
            continue;
        if(i==2)
        {
            count++;
            max= i;
            continue;
        }
        if(i%2==0)
            continue;
        boolean b= true;
        for(int j= 3; j<=(int)Math.sqrt(i); j++)
        {
            if(i%j==0)
            {
                b= false;
                break;
            }
        }
        if(b)
        {
            count++;
            if(i>max)
                max= i;
        }
    }
    System.out.println("Count: "+count+", Largest: "+max);
}