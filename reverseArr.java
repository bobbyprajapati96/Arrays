package Array;

public class reverseArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int mid=Math.floorDiv(arr.length,2 ); //mid element
        for(int i=0;i<mid;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
