
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to create the input for the user
        Scanner input = new Scanner(System.in);
        //set variable for what tile they are on
        int tileNumber = 1;
        while (tileNumber < 100) {
            //Ask user for the sum of their dice roll
            System.out.println("What was the sum of your dice roll");
            //get dice roll
            int diceRoll = input.nextInt();
            //adjust tile number based on dice roll
            tileNumber = tileNumber + diceRoll;
            //test if it is within dice capabilities
            if ((diceRoll > 12) || (diceRoll < 2)) {
                //tell them the have quit
                System.out.println("You quit");
                break;
            }
            // test if diceRoll puts them above tile 100
            if (tileNumber > 100) {
                //Undo the action of the dice roll
                tileNumber = tileNumber - diceRoll;
                //tell them that are not allowed this
                System.out.println("You may not go above tile 100");
            }
            //tell the user what tile (number) they are on
            System.out.println("You are on tile " + tileNumber);
            //Create the Snakes
            //test if they have steped on a snake
            if (tileNumber == 12) {
                //this sets the player back 7 spaces
                tileNumber = tileNumber - 7;
                //tell the player they came upon a snake
                System.out.println("You Landed on a snake, you are now on tile " + tileNumber);
            }
            //test if they have steped on a snake
            if (tileNumber == 25) {
                //this sets the player back 4 spaces
                tileNumber = tileNumber - 4;
                //tell the player they came upon a snake
                System.out.println("You Landed on a snake, you are now on tile " + tileNumber);
            }
            //test if they have steped on a snake
            if (tileNumber == 68) {
                //this sets the player back 53 spaces
                tileNumber = tileNumber - 53;
                //tell the player they came upon a snake
                System.out.println("You Landed on a snake, you are now on tile " + tileNumber);
            }
            //test if they have steped on a snake
            if (tileNumber == 84) {
                //this sets the player back 12 spaces
                tileNumber = tileNumber - 12;
                //tell the player they came upon a snake
                System.out.println("You Landed on a snake, you are now on tile " + tileNumber);
            }
            //create the ladders
            //test if they have steped on a ladder
            if (tileNumber == 4) {
                //This sets the player forward 24 spaces
                tileNumber = tileNumber + 24;
                //tell the player they came upon a ladder
                System.out.println("You landed on a ladder, you are now on tile " + tileNumber);
            }
            //test if they have steped on a ladder
            if (tileNumber == 36) {
                //This sets the player forward 15 spaces
                tileNumber = tileNumber + 15;
                //tell the player they came upon a ladder
                System.out.println("You landed on a ladder, you are now on tile " + tileNumber);
            }
            //test if they have steped on a ladder
            if (tileNumber == 67) {
                //This sets the player forward 23 spaces
                tileNumber = tileNumber + 23;
                //tell the player they came upon a ladder
                System.out.println("You landed on a ladder, you are now on tile " + tileNumber);
            }
        }
        if (tileNumber == 100) {
            System.out.println("Congratulations you have reached tile 100!");
        }
    }
}