package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RethrowingExceptions {
    
    public static void main(String[] args) throws IOException, FileNotFoundException {
        rethrowingExceptions();
    }

    public static void rethrowingExceptions() throws IOException{
        File file = new File("nonexistent/file.txt");
        file.createNewFile();

        Scanner fileReader = new Scanner(file);
        fileReader.close();
    }
}
