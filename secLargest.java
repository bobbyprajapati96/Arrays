package Array;

import java.util.Arrays;

public class secLargest {
    public static void main(String[] args) {
        int arr[]={23,8,12,42,54,64};
//        for(int i=0 ;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(arr[arr.length-2]);


// second method to find seclargest
//        int arr_size=arr.length;
//        if (arr_size < 2)
//        {
//            System.out.printf(" Invalid Input ");
//            return;
//        }
//        // Sort the array
//        Arrays.sort(arr);
//        for (int i = arr_size - 2; i >= 0; i--)
//        {
//            // If the element is not
//            // equal to largest element
//            if (arr[i] != arr[arr_size - 1])
//            {
//                System.out.printf("The second largest " +
//                        "element is %d\n", arr[i]);
//                return;
//            }
//        }

        //3rd method in O(n)

        int max,secmax;
        max=secmax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else {
                if(arr[i]>secmax && arr[i]!=max)
                {
                    secmax=arr[i];
                }
            }
        }
        System.out.println(secmax);


//        System.out.printf("There is no second " +
//                "largest element\n");

    }
}
