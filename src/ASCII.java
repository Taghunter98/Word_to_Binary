/**
 The ASCII class is responsible for populating a HashMap that maps characters (A-Z, a-z, 0-9,
 and special characters) to their corresponding binary ASCII representation.

 This class contains:
 - A static HashMap called asciiMap, which stores the mapping of characters to their binary ASCII values.
 - A static method asciiMap(), which populates the map with characters and their binary representations.

 Example Usage:
 ASCII.asciiMap(); // Populates the asciiMap
 String binaryValue = ASCII.asciiMap.get('A'); // Retrieves binary value for 'A'

 Supported Characters:
 - Uppercase letters: A-Z
 - Lowercase letters: a-z
 - Digits: 0-9
 - Special characters: space (' '), punctuation, and symbols like '!','@','#','$', etc.
 */

import java.util.HashMap;

public class ASCII {
    // A static HashMap to store character-to-binary mappings
    public static HashMap<Character, String> asciiMap = new HashMap<>();

    /**
     * Populates the asciiMap with characters (A-Z, a-z, 0-9, and special characters)
     * and their corresponding binary ASCII values.
     */
    public static void asciiMap() {
        // Adding A-Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            asciiMap.put(ch, String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0'));
        }

        // Adding a-z
        for (char ch = 'a'; ch <= 'z'; ch++) {
            asciiMap.put(ch, String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0'));
        }

        // Add 0-9 (digits) to asciiMap
        for (char ch = '0'; ch <= '9'; ch++) {
            asciiMap.put(ch, String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0'));
        }

        // Add common special characters to asciiMap
        char[] specialChars = {
                ' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/',
                ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~'
        };

        for (char ch : specialChars) {
            asciiMap.put(ch, String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0'));
        }
    }
}
