
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question2 {
    private static int number;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to create the input for the user
        Scanner input = new Scanner(System.in);
        
        //ask user for their measurement
        System.out.println("Please enter a measurement in inches");
        //get the measurement form the user
        double number = input.nextDouble();
        //calculate the measurement in cm
        number = number * 2.54;
        System.out.println("your measurement in centimeters is " + number);
    }
}
