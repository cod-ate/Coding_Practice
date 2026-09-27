//  Valid Palindrome with Noise

void main()
{
    // madam
    String s1= "A man, a plan, a canal: Panama";
    String s2= "race a car";
    System.out.println(isPalindrome(s1));
    System.out.println(isPalindrome(s2));
}
String isPalindrome(String s)
{
    s= s.replaceAll("[^a-zA-Z0-9]", "");
    s= s.toLowerCase();
    int i= 0, j= s.length()-1;
    while(i<j)
    {
        if(s.charAt(i)!=s.charAt(j))
            return "Not Palindrome";
        i++; j--;
    }
    return "Palindrome";
}