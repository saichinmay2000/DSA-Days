package Arrays;

import java.util.HashMap;

public class TwoSumTwoArray {
    static void findPairs(int[] arr1, int[] arr2, int m, int n, int x){

        HashMap<Integer, Integer> hm = new HashMap<>();

        // First we will put all the array 1 elements to hashmap
        for (int i=0; i<m; i++){
            hm.put(arr1[i], 0);
        }

        for (int j=0; j<n; j++){
            if(hm.containsKey(x - arr2[j])){
                System.out.println((x-arr2[j]) + " " + arr2[j]);
            }
        }


    }


    public static void main(String[] args)
    {
        int arr1[] = { 1, 0, -4, 7, 6, 4 };
        int arr2[] = { 0, 2, 4, -3, 2, 1 };
        int x = 8;

        findPairs(arr1, arr2, arr1.length, arr2.length, x);
    }
}
