package Array;

public class removeELe {
    public static void main(String[] args) {
        int arr[]={3,2,2,3};
        int i=0;
        int val=3;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=val)
            {
                arr[i]=arr[j];
                i++;
            }
        }
        System.out.println("length of arr "+ i);
    }
}
