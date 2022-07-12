package Array;

import java.util.Arrays;
public class minimize_the_max_height {
    public static int maxheight(int arr[],int k)
    {
        int n=arr.length;
        Arrays.sort(arr);
        int ans=(arr[n-1]+k)-(arr[0]+k); // Maximum possible height difference
        int tempmax=arr[n-1]-k; // Maximum element when we subtract k from whole array
        int tempmin=arr[0]+k;  // Minimum element when we add k to whole array
        int max,min;
        for(int i=0;i<n-1;i++)
        {
            if(tempmax > (arr[i]+k))
                max=tempmax;
            else
                max=arr[i]+k;
            if(tempmin<(arr[i+1]-k)){
                min=tempmin;
            }
            else
                min=arr[i+1]-k;
            if(ans>(max-min)){
                ans=max-min;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 4, 8, 8, 8, 9};
        int k = 6;
       int ans= maxheight(arr,k);
        System.out.println(ans);
    }
}
