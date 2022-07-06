package Array;

public class buy_and_sell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int maxp=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1]) //check if front ele is greater than prev one then only sell
            {
                maxp+=arr[i]-arr[i-1]; //add diff of front ele and prev Ele
            }
        }
        System.out.println(maxp);
    }
}
