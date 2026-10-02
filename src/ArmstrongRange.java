//  Armstrong Range Certification – QuantumTech Electronics

void main()
{
    int left= 100, right= 500;
    int count= 0;
    for(int i= left; i<=right; i++)
    {
        int sum= 0;
        int temp= i;
        while(temp!=0)
        {
            int rem= temp%10;
            sum += (rem*rem*rem);
            temp /= 10;
        }
        if(sum==i)
        {
            System.out.print(i+" ");
            count++;
        }
    }
    if(count==0)
        System.out.println("None Found!!");
    else
        System.out.println("\nCount: "+count);
}