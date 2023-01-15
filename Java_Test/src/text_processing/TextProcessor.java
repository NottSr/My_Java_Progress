package text_processing;

public class TextProcessor {
    
    public static void main(String[] args) {
        countWords("I love Java");
        reverseString("stop");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text full string to be split
     */
    public static void countWords(String text) {
        // Get the split text and find the length
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        // Format the message
        String message = String.format("Your string contains %d words", numberOfWords);

        // Output
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a string in reverse order
     * @param text full string to be reversed
     */
    public static void reverseString(String text) {
        // Loop that goes backwards through the text
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
