package Array;

import java.util.Arrays;

public class count_Freq {
    public static void main(String[] args) {
        int[] arr = {10, 30, 10, 20, 10, 20, 30, 10};
        int size = arr.length;

        boolean visited[]=new boolean[size];
        Arrays.fill(visited,false);
        for (int i = 0; i < size; i++) {

// Skip this element if already processed
            if (visited[i] == true)
                continue;

// Count frequency
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count +" times ");
        }
    }
}
