package fill_my_story;

import java.util.Scanner;

public class FillMyStory {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's create a story!");

        //1. Get a season of the year
        System.out.println("What is your favourite season of the year?");
        String season = scanner.next();

        //2. Get a whole number
        System.out.println("Please type a whole number");
        int num = scanner.nextInt();

        //3. Get an adjective
        System.out.println("Tell me an adjective");
        String adj = scanner.next();

        scanner.close();

        //4. Printing the story
        System.out.println("On a(n) " + adj + " " + season + " day, I drink a minimum of " + num + " cups of coffe");
    }
}
