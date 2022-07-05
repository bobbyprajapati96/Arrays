package Sortings;

public class sort012 {
    public static void swap(int arr[], int left,int right)
    {
      int temp=arr[left];
      arr[left]=arr[right];
      arr[right]=temp;

    }
    public static void main(String[] args) {
        int arr[]={0,2,1,0,2,1,0,0};
        int left=0;
        int right=arr.length-1;
        int current=0;
        while(current<=right)
        {
            if(arr[current]==0)
            {
                int temp=arr[left];
                arr[left]=arr[current];
                arr[current]=temp;
                left++;
                current++;
            }
            else if(arr[current]==2)
            {
                int temp=arr[current];
                arr[current]=arr[right];
                arr[right]=temp;
                right--;
            }
            else
            {
                current++;
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
