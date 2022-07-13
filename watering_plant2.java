package Array;

public class watering_plant2 {
    public static int count(int arr[],int alicecap,int bobcap){
        int refilA=0;
        int refilB=0;
        int capA=alicecap;
        int i=0;
        int capB=bobcap;
        int j=arr.length-1;
        while(i<j) {
            if (capA < arr[i]) { //cap of Alice is less so she has to refil her can
                refilA++;
                capA = alicecap;
            }
            if (capB < arr[j]) {  ////cap of Bob is less so he has to refil her can
                capB = bobcap;
                refilB++;
            }
            capA=capA-arr[i]; // otherwise we fill go further watering plants
            capB=capB-arr[j]; //
            i++;
            j--;
            if (i == j){ // if both are on same plant
                if(capA<arr[i] && capB<arr[j]) //if any of cap is less so cap should refil
                {
                    refilA++;
                }
            }
        }
        return refilA+refilB;
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,3};
        int alicecap=3;
        int bobcap=4;
       int ans= count(arr,alicecap,bobcap);
        System.out.println(ans);
    }
}
