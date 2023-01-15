package loops;

import java.util.Scanner;

public class LetterSearch {
    
    public static void main(String[] args){
        // Get word
        System.out.println("Enter some word:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // Search text for letter 'A'
        for(int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'a' || currentLetter == 'A'){
                letterFound = true;
                break;
            }
        }

        // Output
        if(letterFound) System.out.println("Letter a/A has been found!");
        else System.out.println("No letter a/A has been found");
    }
}
