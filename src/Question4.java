
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to create the input for the user
        Scanner input = new Scanner(System.in);
        
        //ask user for the cost of the Food
        System.out.println("Please enter the cost of the food");
        //get number from user
        double number1 = input.nextDouble();
        
        //ask user for the cost of the DJ
        System.out.println("Please enter the cost of the DJ");
        //get number from user
        double number2 = input.nextDouble(); 
        
        //ask user for the cost of the hall
        System.out.println("Please enter the cost of renting the hall");
        //get number from user
        double number3 = input.nextDouble();
        
        //ask user for the cost of the decorations
        System.out.println("Please enter the cost of the decorations");
        //get number from user
        double number4 = input.nextDouble();
        
        //ask user for the cost of staff
        System.out.println("Please enter the cost of the staff");
        //get number from user
        double number5 = input.nextDouble();
        
        //ask user for miscellaneous cost
        System.out.println("Please enter any miscellaneous cost");
        //get number from user
        double number6 = input.nextDouble();
        
        //calculate grand total
        double grandTotal = number1 + number2 + number3 + number4 + number5 + number6;
        //find the number of tickets required
        double numberOfTickets = grandTotal / 35; 
        //round up the answer
        numberOfTickets = Math.ceil(numberOfTickets);
        //print out to user the answers
        System.out.println("The total cost of Prom is " + grandTotal + ", This requires " + numberOfTickets + " tickets to break even.");
        
    }
}
