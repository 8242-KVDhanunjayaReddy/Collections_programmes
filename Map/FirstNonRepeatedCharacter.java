package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedChar(input);
        if (result != 0) {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Populate the LinkedHashMap with character counts
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0; // Return 0 if no non-repeated character is found
    }
}

