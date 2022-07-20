package Array;

public class biker_problem {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,1};
        int c=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1) sum+=c;
            else c++;
        }
        System.out.println(sum);
    }
}