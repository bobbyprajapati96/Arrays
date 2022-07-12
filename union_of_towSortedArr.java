package Array;

//        Use two index variables i and j, initial values i = 0, j = 0
//        If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
//        If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
//        If both are same then print any of them and increment both i and j.
//        Print remaining elements of the larger array.

public class union_of_towSortedArr {
    public static void union(int arr[],int brr[]){
        int i=0;
        int j=0;
        while(i<arr.length && j<brr.length)
        {
            if(arr[i]<brr[j])
            {
                System.out.print(arr[i]+" ");
                i++;
            }
            else if(brr[j]<arr[i])
            {
                System.out.print(brr[j]+" ");
                j++;
            }
            else
            {
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
         while(i<arr.length)
         {
             System.out.print(arr[i]+" ");
             i++;
         }
            while(j<brr.length)
            {
                System.out.print(brr[j]+" ");
                j++;
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int brr[]={7,8,9,10,11,12};
        union(arr,brr);
    }
}
