package exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch {
    
    public static void main(String[] args) {
        
        // Finding a file with a path
        File file = new File("resources/nonexisten.txt");

        // Try statement
        try{
            file.createNewFile();
        } catch(IOException e){
            System.out.println("Sorry, an error has occured: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
