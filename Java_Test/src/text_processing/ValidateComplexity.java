package text_processing;

import java.util.Scanner;

public class ValidateComplexity {

    // Initialize known values
    public static String username = "johndoe";
    public static String oldPassword = "ABC_1234";

    public static void main(String[] args) {

        // Initialize known values
        String newPassword = "";
        boolean valid = false;

        // Asking the user for a new password
        Scanner scanner = new Scanner(System.in);
        
        // Loop that will continue until user enter a valid password
        do {
            System.out.println("Please enter a new password:");
            newPassword = scanner.next();
            // Conditional statements
            valid = changePassword(newPassword);
        } while (!valid);

        scanner.close();

        System.out.println("Congrats! You've updated your password succesfully");
    }

    /**
     * Checks if a text contains an uppercase
     * @param text String to check
     * @return true or false
     */
    public static boolean upperCaseValidator(String text){
        // Initialize known values
        String upperCaseDict = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Loop that will check for an upper case
        for (int i = 0; i < upperCaseDict.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if(upperCaseDict.charAt(i) == text.charAt(j)){
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Checks if a text contains an special character
     * @param text String to check
     * @return true or false
     */
    public static boolean specialCharValidator(String text){
        // Initialize known values
        String specialCharDict = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

        // Loop that will check for a special character
        for (int i = 0; i < specialCharDict.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if(specialCharDict.charAt(i) == text.charAt(j)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean changePassword(String newPassword){

        boolean valid = true;

        if(newPassword.length() < 8){
            valid = false;
            System.out.println("Invalid format. Your password should be at least 8 characters long.");
        }

        if (!upperCaseValidator(newPassword)) {
            valid = false;
            System.out.println("Invalid format. Your password must have at least an uppercase letter.");
        }

        if (!specialCharValidator(newPassword)) {
            valid = false;
            System.out.println("Invalid format. Your password must have at least one special character.");
        }

        if (newPassword.contains(username)) {
            valid = false;
            System.out.println("Invalid format. Your password cannot contain your username.");
        }

        if (newPassword.equals(oldPassword)) {
            valid = false;
            System.out.println("Invalid format. Your password cannot be the same as your current one.");
        }
        
        if (valid) return true;
        else return false;
    }
}
