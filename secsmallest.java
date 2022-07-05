package Array;

public class secsmallest {
    public static void main(String[] args) {
        int arr[]={23,8,12,42,54,64};
        int smallest=Integer.MAX_VALUE;
//        System.out.println(smallest);
          for(int i=0;i<arr.length;i++)
          {
              if(arr[i]<smallest)
                   smallest=arr[i];
          }
          int secSmall=Integer.MAX_VALUE;
          for(int i=0;i<arr.length;i++)
          {
              if(arr[i]!=smallest && arr[i]<secSmall)//smallest != smallest 8!=8 false;
                   secSmall=arr[i];
          }
        System.out.println(secSmall);
    }
}
