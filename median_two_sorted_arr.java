package Array;

import java.util.Arrays;

public class median_two_sorted_arr {
    public static double find(int arr[],int brr[]) {
        int n = arr.length;
        int m = brr.length;
        int[] mrg = new int[m + n];
        int p = 0;
        int max = Math.max(m, n);
        for (int i = 0; i < max; i++) {
            if (i < n) {
                mrg[p++] = arr[i];
            }
            if (i < m) {
                mrg[p++] = brr[i];
            }
        }
        Arrays.sort(mrg);
        int a = mrg.length;
        if (a % 2 != 0){
            int s=(a+1)/2;
            return mrg[s-1];
        }
        else
        {
            int b=a/2;
            double f=(mrg[b]+mrg[b-1])/2.0;
            return f;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3};
        int brr[]={2};
       double ans= find(arr,brr);
        System.out.println(ans);
    }
}
