package Arrays;

import java.util.*;


public class FindDuplicatesInArray {


    static ArrayList<Integer> findDuplicates(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue() > 1){
                result.add(entry.getKey());
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }

        return result;

    }



    public static void main(String[] args) {

        int[] arr = { 1, 6, 5, 2, 3, 3, 2 };
        ArrayList<Integer> duplicates = findDuplicates(arr);

        for (int element : duplicates) {
            System.out.print(element + " ");
        }
    }
}
