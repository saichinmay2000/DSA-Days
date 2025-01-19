package Arrays;

public class MaximumProductSubarray {

    static int maxProduct(int[] arr){
        int res = arr[0];
        for(int i=0; i<arr.length; i++){
            int prod = 1;
            for (int j=i; j< arr.length; j++){
                prod = prod * arr[j];
                res = Math.max(res, prod);
            }

        }
        return res;
    }




    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }
}
