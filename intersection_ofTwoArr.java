package Array;

public class intersection_ofTwoArr {
    public static void intersect(int arr[],int brr[])
    {
        int i=0;
        int j=0;
        while(i<arr.length && j<brr.length)
        {
            if(arr[i]< brr[j])
            {
                i++;
            }
            else if (arr[i]>brr[j]){
                j++;
            }
            else{
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int brr[]={4,5,6,10,11,12};
        intersect(arr,brr);
    }
}
