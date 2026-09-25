public class Palindrome {
    public static void main(String[] args)
    {
        String s= "Hello123";
        System.out.println(isPalindrome(s));
        s= "Madam";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s)
    {
        s= s.toLowerCase().trim();
        int i=0, j= s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}
