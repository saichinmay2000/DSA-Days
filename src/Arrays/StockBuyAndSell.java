package Arrays;

public class StockBuyAndSell {
    static int BuySell(int[] arr){
        int minSo = arr[0];
        int res = 0;

        for (int j=1; j<arr.length; j++){
            minSo = Math.min(minSo, arr[j]);
            res = Math.max(res, arr[j] - minSo);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 1, 3, 6, 9, 2 };
        System.out.println(BuySell(arr));
    }
}
