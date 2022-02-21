package GracelaCheckingWhetherAStringContainsOnlyDegits;
import java.util.Scanner;
public class CheckingWhetherAStringContainsOnlyDegits {

    
    /**
     * This method will output wether the checkString method returns true/false
     * @param string will be used for the checkString method for asessment
     */
    public static void checkedString(String string) {
        if(checkString(string) == true) {
            System.out.println("The string contains only digits");
        } else {
            System.out.println("The string contains mixed characters");
        }
        System.out.println();
    }

    /**
     * This method will check wether the passed string contains 0-9 digits
     * @param string this is the string to be checked
     * @return will return true/false depends wether the string contains only digits
     */
    public static boolean checkString(String string) {
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                return true;
            } else {
                return false;
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.println();
        
        // invoked the checkString method to asses the inputted string
        checkedString(string);
    }
}