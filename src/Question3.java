
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to create the input for the user
        Scanner input = new Scanner(System.in);
        
        //ask user for their numbers
        System.out.println("Please enter 4 numbers all on seprate lines");
        //collect all 4 numbers from user
        double number1 = input.nextDouble();
        
        double number2 = input.nextDouble();
         
        double number3 = input.nextDouble();
        
        double number4 = input.nextDouble();
        // tell the user their numbers
        System.out.println("your numbers were " + number1 + ", "  + number2 + ", " + number3 + ",and " + number4);
    }
}
