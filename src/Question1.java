      
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to create the input for the user
        Scanner input = new Scanner(System.in);
        
        //ask user for their name
        System.out.println("Please enter your name");
        //get the name form the user
        String name = input.nextLine();
        //say hello
        System.out.println("hello " + name + ". How are you today?");
    }
}
