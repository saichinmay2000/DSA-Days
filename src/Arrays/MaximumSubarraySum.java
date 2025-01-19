package Arrays;

public class MaximumSubarraySum {

    static int maxSubarraySum(int[] arr){
        int res = arr[0]; //2
        int maxEnding = arr[0]; //2

        for (int i=1; i<arr.length; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding); //5
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
