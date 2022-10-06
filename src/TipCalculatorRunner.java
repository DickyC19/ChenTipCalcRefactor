// imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // Greeting and # of people with tip percentage
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What is the tip percentage? (0-100): ");
        double tipPercent = scan.nextDouble();
        scan.nextLine();

        // TipCalculator constructor
        TipCalculator tipCal1 = new TipCalculator(numPeople, tipPercent);

        // costs in dollars and cents until -1 is entered
        double dishCost = 0;
        while (dishCost >= 0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            dishCost = scan.nextDouble();
            tipCal1.addMeal(dishCost);
        }

        // final prints using DecimalFormat
        System.out.println("------------------------------------");
        System.out.println("Total Bill Before Tip: $" + formatter.format(tipCal1.getNoTipBill()));
        System.out.println("Tip Percentage: $" + formatter.format(tipCal1.getTipPercent()));
        System.out.println("Total Tip: $" + formatter.format(tipCal1.totalTip()));
        System.out.println("Total Bill With Tip: $" + formatter.format(tipCal1.totalBill()));
        System.out.println("Per Person Cost Before Tip: $" + formatter.format(tipCal1.perPersonNoTip()));
        System.out.println("Tip Per Person: $" + formatter.format(tipCal1.perPersonTip()));
        System.out.println("Total Cost Per Person: $" + formatter.format(tipCal1.perPersonBill()));

    }
}
