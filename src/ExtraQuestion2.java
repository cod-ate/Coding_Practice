/*
Write a function that accepts a raw license plate string plate (up to 100 characters)
and returns a formatted version. First, extract only the valid alphanumeric
characters (letters and digits), discarding any spaces or special characters,
and convert all lowercase letters to uppercase.
Then, format the cleaned string by inserting hyphens to split it into groups of three (for example, "ABC123XYZ" becomes "ABC-123-XYZ").
If the input does not meet the validity rules, return the string "INVALID".
*/

void main()
{
    String s= "abc123,ol-ol).[123dfgopOiq5t=i";
    System.out.println(licencePlate(s));
    s= "abc,123,ol-ol)3dfgOiq5t=i";
    System.out.println(licencePlate(s));
    s= "abc-123-qwe";
    System.out.println(licencePlate(s));
}
String licencePlate(String s)
{
    if(s.isEmpty())
        return "Invalid";

    s= s.replaceAll("[^A-Za-z0-9]", "");
    s= s.toUpperCase();

    if(s.length()%3!=0)
        return "Invalid";

    StringBuilder sb= new StringBuilder(s);
    int count= sb.length()/3-1;
    int i= 3;
    while(count!=0)
    {
        count--;
        sb.insert(i,"-");
        i+=4;
    }
    return sb.toString();
}