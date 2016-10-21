
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to create the input for the user
        Scanner input = new Scanner(System.in);

        //Ask user for their day time minutes
        System.out.println("Number of Daytime minutes?");
        //get day time minutes
        double dayTimeMinutes = input.nextDouble();

        //Ask user for their evening minutes
        System.out.println("Number of evening minutes?");
        //get evening minutes
        double eveningMinutes = input.nextDouble();

        //Ask user for their weekend minutes
        System.out.println("Number of weekend minutes?");
        //get weekend minutes
        double weekEndMinutes = input.nextDouble();

        //Determine cost of Plan A
        double planADayTimeMinutes = (dayTimeMinutes - 100) * 0.25;
        double planAEveningMinutes = eveningMinutes * 0.15;
        double planAWeekEndMinutes = weekEndMinutes * 0.20;
        //see if such cost is less than 0 if so set to be 0
        double totalPlanA = (planAWeekEndMinutes + planAEveningMinutes + planADayTimeMinutes);
        if (totalPlanA < 0) {
            totalPlanA = 0;
        }
        //say what the cost is
        System.out.println("Plan A Costs $" + (totalPlanA));

        //Determine cost of Plan B
        double planBDayTimeMinutes = (dayTimeMinutes - 250) * 0.45;
        double planBEveningMinutes = eveningMinutes * 0.35;
        double planBWeekEndMinutes = weekEndMinutes * 0.25;
        //see if such cost is less than 0 if so set to be 0
        double totalPlanB = (planBWeekEndMinutes + planBEveningMinutes + planBDayTimeMinutes);
        if (totalPlanB < 0) {
            totalPlanB = 0;
        }
        //say what the cost is
        System.out.println("Plan B Costs $" + totalPlanB);

        //Determine which plan is better     
        if ((totalPlanA) < (totalPlanB)) {
            System.out.println("Plan A is better");
        }
        if ((totalPlanA) == (totalPlanB)) {
            System.out.println("Plan B and Plan A are both the same price");
        }
        if ((totalPlanA) > (totalPlanB)) {
            System.out.println("Plan B is better");
        }
    }
}
