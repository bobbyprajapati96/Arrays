package Array;

import java.util.Arrays;

public class heightOfTOwers {
    static int differ(int arr[],int n,int k){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=k){
                arr[i]=arr[i]-k;
            }
            else{
                arr[i]=arr[i]+k;
            }
        }
        Arrays.sort(arr);
        for(int a:arr)
            System.out.print(a+" ");
        return arr[n-1]-arr[0];
    }
    public static void main(String[] args) {
        int arr[]={1,5,8,10};
        int k=2;
        int n= arr.length;
       int ans= differ(arr,n,k);
        System.out.println();
        System.out.println("difference between hieghts "+ ans);
    }
}
