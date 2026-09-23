package DSAPrograms;

import java.util.HashMap;
import java.util.Map;

public class MostRepeating {

    public static void main(String[] args) {

        String s = "aashique";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        int maxi=0;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxi=Math.max(maxi, map.get(c));
        }

        
        // Find first non-repeating character
        for (char c : s.toCharArray()) {
        	int x=map.get(c);
        	if(x==maxi) 
        		{
        		System.out.println(c);
        		break;
        		}
        }
        }
        
    }
