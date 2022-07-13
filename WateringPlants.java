package Array;

public class WateringPlants
{
    public static int count(int arr[],int n,int cap) {
        int steps = 0;
        int can = cap;
        int i = 0;
        while (i < arr.length){
            if (can >= arr[i]) {
                can = can - arr[i];
                ++steps;
                ++i;
            } else {
                can = cap;
                steps = steps + i * 2; //go back when can->cap < arr[i] i*2 steps back
            }
    }
        return steps;
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,3};
        int n=arr.length;
        int cap=5;
        int ans=count(arr,n,cap);
        System.out.println(ans);
    }

}
