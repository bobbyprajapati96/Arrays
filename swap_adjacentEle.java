package Array;

public class swap_adjacentEle {
    static void swap(int arr[])
    {
        for(int i=0;i<arr.length-1;i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={9,3,6,12,4,32};
        swap(arr);
    }
}
