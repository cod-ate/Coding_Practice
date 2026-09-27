// Second-Highest Sales – SuperMart Regional Report

public class SecondHighestSale {
    public static void main(String[] args) {

        int[] arr= {45000,67000,67000,52000,39000};
        int max= arr[0];
        int secMax= Integer.MIN_VALUE;

        for(int val: arr)
        {
            if(val>max)
            {
                secMax= max;
                max= val;
            }
            else if(val>secMax && val!=max)
                secMax= val;
        }
        System.out.println(secMax);
    }
}
