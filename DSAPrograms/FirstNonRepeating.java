package DSAPrograms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String s = "aashique";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating character
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                break;
            }
        }
    }
}