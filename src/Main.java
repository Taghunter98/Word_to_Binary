import java.util.Scanner;

/**
 * The Main class serves as the entry point for the application that converts
 * a user-input word into its corresponding binary ASCII values.
 *
 * This class contains:
 * - A static field `word` to store the user-provided word.
 * - The main method, which initiates the program by calling methods to get user input
 *   and convert the word to binary.
 * - A method `getWord()` to prompt the user for input and store the word.
 * - A method `convertWord()` to convert the input word into its binary ASCII representation
 *   by looking up each character in the ASCII class's asciiMap.
 *
 * Example Usage:
 * 1. Run the Main class.
 * 2. Enter a word or phrase when prompted.
 * 3. The program will output the binary representation of each character in the entered word.
 *
 * Supported Characters:
 * - Uppercase letters: A-Z
 * - Lowercase letters: a-z
 * - Digits: 0-9
 * - Special characters: includes space (' '), punctuation, and symbols like '!', '@', '#', etc.
 */

public class Main {
    // field to store word
    public static String word;

    public static void main(String[] args) {
        getWord();
        convertWord();
    }

    /**
     * Prompts the user to enter a word and stores the input in the `word` field.
     * Utilizes a Scanner for reading user input from the console.
     * */
    public static void getWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Word -> Binary Converter");
        System.out.println("------------------------");
        System.out.println("Enter the word: ");
        word = scanner.nextLine();
    }

    /**
     * Converts the user-provided word into its binary ASCII representation.
     * This method retrieves the asciiMap from the ASCII class and iterates
     * through each character of the word, printing its corresponding binary value.
     * If a character is not found in the asciiMap, it notifies the user.
     */
    public static void convertWord() {
        // import hashmap from ASCII Class
        ASCII.asciiMap();

        // change to charArray
        char[] charArray = word.toCharArray();

        /*
        print corresponding binary values for each character
        iterate through charArray
        check if char exists in asciiMap
        print result
         */
        for (char c : charArray) {
            if (ASCII.asciiMap.containsKey(c)) {
                System.out.println("Character: " + c + " -> Binary: " + ASCII.asciiMap.get(c));
            }
            else {
                System.out.println("Character: " + c + " is not in the ASCII map.");
            }
        }
    }
}
