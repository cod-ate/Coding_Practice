/*
Write a function `pigLatin(input-word)`
that converts a single input word into its Pig Latin equivalent and
prints the final result. If the word starts with a vowel, simply append
"-yay" to the end of the word (e.g., "egg" becomes "egg-yay"). If the
word begins with one or more consonants, move the entire initial consonant
cluster (all letters before the first vowel) to the end of the word, insert
a hyphen before the moved cluster, and append "ay" (e.g., "glove" becomes "ove-glay").
*/

import java.util.*;
class ExtraQuestion1 {
    public static void main(String[] args) {
        String s1= "it", s2= "egg", s3= "glove", s4= "hello world";
        System.out.println(pigLatin(s1));
        System.out.println(pigLatin(s2));
        System.out.println(pigLatin(s3));
        System.out.println(pigLatin(s4));
    }
    public static String pigLatin(String s)
    {
        s= s.toLowerCase().trim();
        StringBuilder sb= new StringBuilder(s);
        if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' ||
                s.charAt(0)=='o' || s.charAt(0)=='u')
        {
            sb.append("-yay");
            return sb.toString();
        }
        else
        {
            int count= 0;

            for(int i=0; i<s.length(); i++)
            {
                count++;
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
                        s.charAt(i)=='o' || s.charAt(i)=='u')
                {
                    count--;
                    break;
                }
            }
            StringBuilder result= new StringBuilder(sb.substring(count, s.length()));
            result.append("-");
            result.append(sb.substring(0,count));
            result.append("ay");
            return result.toString();
        }
    }
}

