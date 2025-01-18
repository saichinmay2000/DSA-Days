package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        System.out.println(Arrays.toString(res));
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(arr[i] != arr[j]){
                    res[i] = res[i] * arr[j];
                }
            }
        }
        return res;
    }




    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
