package GracelaCheckingWhetherTwoStringsAreAnagram;

import java.util.Arrays;
import java.util.Scanner;

public class CheckingWhetherTwoStringsAreAnagram {


    /**
     * This method will evaluate wether string 1
     * and string2 is Anagram 
     * @param string1 This is the first parameter in checkIfAnagram method
     * @param string2 This is the second parameter in checkIfAnagram method
     */
    public static void checkIfAnagram(String string1, String string2) {
        // declared lenofString variables to identify the length of the strings
        int lenOfString1 = string1.length();
        int lenOfString2 = string2.length();

        // This statement checks if the length of string1 and string2 is equal
        if(lenOfString1 != lenOfString2) {
            System.out.println("The two string are not anagram");
        }

        // convert string1 and string2 into a character array and store it 
        // in charArray1 and charArray2 and Uppercase it to be sorted correctly
        char[] charArray1 = string1.toUpperCase().toCharArray();
        char[] charArray2 = string2.toUpperCase().toCharArray();
        
        // sort charArray1 and charArray2 alphabetically
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // updating the value of string1 and string2
        string1 = String.valueOf(charArray1);
        string2 = String.valueOf(charArray2);

        // checks if string1 and string2 are equal and ignoring case sensitivity
        boolean isAnagram = string1.equalsIgnoreCase(string2);

        // outputs wether string1 and string 2 are anagram
        if (isAnagram == true) {
            System.out.println("The two strings are anagram");
        } else if (isAnagram == false){
            System.out.println("The two strings are not anagram");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks the user to input 2 strings to be assesed
        System.out.print("Enter first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter second string: ");
        String string2 = input.nextLine();
        System.out.println();

        // invoke checkIfAnagram method and asseses wether string1 and string2 are anagram
        checkIfAnagram(string1, string2);
    }
}