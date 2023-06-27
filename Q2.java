import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        
        Map<Character, Integer> freq = new HashMap<>();

        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

    
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1));  // Output: 0

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));  // Output: 2

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3));  // Output: -1
    }
