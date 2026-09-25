void main()
{
    int a= 72, b= 24;
    int gcd= getGCD(a,b);
    if(gcd!=0)
    {
        int lcm= getLCM(a,b,gcd);
        System.out.println("GCD: "+gcd+", LCM: "+lcm);
    }
    else
        System.out.println("Invalid");
}
int getGCD(int a, int b)
{
    while(b!=0)
    {
        int temp= b;
        b= a%b;
        a= temp;
    }
    return a;
}
int getLCM(int a, int b, int gcd)
{
    return (a*b)/gcd;
}