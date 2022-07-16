package unacademy.arrays;

public class search_ElementIN_InfinteSortedArray
{
    static int binarySearch(int a[], int key, int l, int r) {
        while(l <= r) {
            int mid = (l+r)/2;
            if(a[mid] == key) return mid;
            if(key > a[mid]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    static int searchInfiniteSoretedArray(int arr[],int key){
        if(arr.length==0) return -1;
        if(arr[0]==key) return 0;
        int index=1;
        while(arr[index]<=key){
            index*=2;
        }
        return binarySearch(arr,key,index/2,index);
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6, 7, 8, 11, 13, 14, 17, 17, 19, 23, 25, 27, 28, 29, 31, 34, 35, 36};
		int key = 14;
        System.out.println(searchInfiniteSoretedArray(a,key));

    }
}
