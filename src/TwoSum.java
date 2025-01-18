import java.util.HashSet;

public class TwoSum {
    static boolean checkSum(int[] arr, int target){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(hs.contains(complement)){
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        if(checkSum(arr, target)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}