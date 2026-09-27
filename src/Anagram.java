//Anagram Checker for a Word-Puzzle App

public class Anagram {
    public static void main(String[] args) {
        String s1= "silent", s2= "listen";
        System.out.println(isAnagram(s1,s2));

        s1= "hello"; s2= "helloo";
        System.out.println(isAnagram(s1,s2));

        s1= "hello"; s2= "world";
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1, String s2)
    {
        s1= s1.toLowerCase().trim();
        s2= s2.toLowerCase().trim();

        if(s1.length()!=s2.length())
            return false;

        int[] freq= new int[256];
        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for(int i=0; i<s2.length(); i++)
            if(freq[s1.charAt(i)]!=0)
                return false;

        return true;
    }
}
