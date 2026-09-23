package DSAPrograms;

import java.util.HashMap;

public class SubarraySumK {

    public static int countSubarrays(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int k = 3;

        System.out.println(countSubarrays(arr, k));
    }
}