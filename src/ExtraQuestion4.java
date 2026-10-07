/*
perform adjacent swap k positions and move zero to as left as possible
input:-
s= "110101"
k= 1
output:-
"101101"
*/

void main() {
    String s = "110101";
    int k = 2;

    char[] arr= s.toCharArray();

    for(int i= 0; i<arr.length && k>0; i++)
    {
        if(arr[i] != '0')
            continue;

        while(i>0 && k>0 && arr[i-1]=='1')
        {
            char temp= arr[i];
            arr[i]= arr[i-1];
            arr[i-1]= temp;
            i--;
            k--;
        }
    }

    for(char ch: arr)
        System.out.print(ch);
}