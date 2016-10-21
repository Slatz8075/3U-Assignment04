
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to create the input for the user
        Scanner input = new Scanner(System.in);
        
        //Ask user for their name
        System.out.println("What is your name?");
        //store name
        String name = input.nextLine();
        
        //ask user for what their test is out of
        System.out.println("What was your 1st test out of?");
        //get test total
        double test1Total = input.nextDouble();
        //ask user for what they got on their test
        System.out.println("What was your score on the 1st test?");
        //get what they got on their test
        double test1Score = input.nextDouble();
        //get the score as a percent
        double test1 = test1Score/test1Total;
        
        //ask user for what their test is out of
        System.out.println("What was your 2nd test out of?");
        //get test total
        double test2Total = input.nextDouble();
        //ask user for what they got on their test
        System.out.println("What was your score on the 2nd test?");
        //get what they got on their test
        double test2Score = input.nextDouble();
        //get the score as a percent
        double test2 = test2Score/test2Total;
        
        //ask user for what their test is out of
        System.out.println("What was your 3rd test out of?");
        //get test total
        double test3Total = input.nextDouble();
        //ask user for what they got on their test
        System.out.println("What was your score on the 3rd test?");
        //get what they got on their test
        double test3Score = input.nextDouble();
        //get the score as a percent
        double test3 = test3Score/test3Total;
        
        //ask user for what their test is out of
        System.out.println("What was your 4th test out of?");
        //get test total
        double test4Total = input.nextDouble();
        //ask user for what they got on their test
        System.out.println("What was your score on the 4th test?");
        //get what they got on their test
        double test4Score = input.nextDouble();
        //get the score as a percent
        double test4 = test4Score/test4Total;
        
        //ask user for what their test is out of
        System.out.println("What was your 5th test out of?");
        //get test total
        double test5Total = input.nextDouble();
        //ask user for what they got on their test
        System.out.println("What was your score on the 5th test?");
        //get what they got on their test
        double test5Score = input.nextDouble();
        //get the score as a percent
        double test5 = test5Score/test5Total;
        
        System.out.println("Test scores for " + name);
        //print out test scores
        System.out.println("Test 1:" + test1 * 100 + "%");
        System.out.println("Test 2:" + test2 * 100 + "%");
        System.out.println("Test 3:" + test3 * 100 + "%");
        System.out.println("Test 4:" + test4 * 100 + "%");
        System.out.println("Test 5:" + test5 * 100 + "%");
        //calculate average 
        double average = ((test1 + test2 + test3 + test4 + test5) / 5) * 100;
        //display average
        System.out.println("Average:" + average + "%");
        
    }
}
