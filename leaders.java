package Array;
// i=4  -> 9>lar true; and put 9 in brr;
//i=3   -> 3>9 false;
//i=5  ->  5>9 false;
//i=10 ->  10>9 true largest=10 and put 10 in brr;
//i=1  ->  1>10 false;

public class leaders {
    static void findLeaders(int arr[],int n)
    {
        int brr[]=new int[n];
        int largest=Integer.MIN_VALUE;
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>largest){
                largest=arr[i];
                brr[j++]=arr[i];
            }
        }
        for(int i=j-1;i>=0;i--)
        {
            System.out.print(brr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,10,5,3,9};
        int n=arr.length;
        findLeaders(arr,n);
    }
}
