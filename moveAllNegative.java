package Array;

public class moveAllNegative {
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static  void move(int arr[])
    {
        int j=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]<0){
               if(i!=j)
                {
                    swap(arr,i,j);
                    j++;
                }
            }
        }
        for(int a:arr)
            System.out.print(a+" ");
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,-4,5,6};
        move(arr);

    }
}
