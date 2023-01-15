package loops;

import java.util.Random;

public class RollTheDice {
    
    public static void main(String[] args){
        // Initialize known variables
        int board = 20;
        int position = 0;
        int roll = 0;
        int i = 0;
        Random random = new Random();

        for(i = 0; i < 5; i++){
            roll = random.nextInt(6) + 1;
            position += roll;

            if (position == board) break;

            if(position < board){
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + roll + ". You are now in space " + position + 
                    " and have " + (board - position) + " more to go.");
            }
        }

        if (position > board){
            System.out.println("Roll #" + i + ": You've rolled a " + roll + ". You went too far");
        }
        else if (position < board){
            System.out.println("You run out of moves at space: " + position);
        }
        else{
            System.out.println("Roll #" + (i + 1) + ": You've rolled a " + roll + ". You're on space " + position + 
            ". Congrats, you win!");
        }
    }
}
