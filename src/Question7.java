
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to create the input for the user
        Scanner input = new Scanner(System.in);

        //Ask user for their speed
        System.out.println("What was your speed?");
        //get speed
        double speed = input.nextDouble();
        //ask user for speed limit
        System.out.println("What was the speed limit?");
        //get speed limit
        double speedLimit = input.nextDouble();

        //determine if he was below the speed limit
        if (speed < speedLimit) {
            //congratulate them
            System.out.println("Congratchumalashuns, you are below the speeed limit");
        }

        //create a variable which is 20 km above the speed limit
        double twentyAbove = (speedLimit + 20);
        //determine if they are within this range
        if (((speed > speedLimit) && (speed < twentyAbove)) || speed == twentyAbove) {
            //PUNISH THEM
            System.out.println("You were atleast 1 - 20 km above the speed limit, you get a $100 fine");
        }

        //create a variable which is 21 - 30 km above the speed limit
        double thirtyAbove = (twentyAbove + 10);
        //determine if they are within this range
        if ((speed > twentyAbove) && ((speed < thirtyAbove)) || speed == thirtyAbove) {
            //PUNISH THEM
            System.out.println("You were atleast 21 - 30 km above the speed limit, you get a $270 fine");
        }
//      
        //determine if they have surpassed the 21 - 30 km range
        if (speed > thirtyAbove) {
            //PUNISH THEM
            System.out.println("You were atleast 31 km above the speed limit, you get a $500 fine");
        }

    }
}
