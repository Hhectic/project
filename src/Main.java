import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //Scanner is set, allowing us to store user inputs into variables
        //User input for bill stored into a double
        Scanner AUGH = new Scanner(System.in);
        System.out.println("How much is the total bill");
        double bill = AUGH.nextDouble();

        //User input for tip percentage as a whole number stored into a double
        System.out.println("How much is the tip percentage (number please)");
        double tip = AUGH.nextDouble();

        //User input for the amount of people attending stored into an Int
        System.out.println("What is the party size");
        int party = AUGH.nextInt();

        //Total for tip set to bill multiplied by tip divided by 100 and rounded to nearest hundredth and stored as a double
        double totalTip = bill * (tip/100);
        System.out.format("Total tip needed to be payed is: $ %.2f", totalTip);
        System.out.println("");

        //Whole entire bill is bill and total tip added, needs to be rounded to the nearest hundredth as well and stored as a double
        double wholeBill = bill + totalTip;
        System.out.format("The total bill needed to be payed is $ %.2f", wholeBill);
        System.out.println("");

        //Total tip is divided by party to see how much each person needs to pay for tip. Also rounded to nearest hundredth and stored as a double
        double tipPP = totalTip/party;
        System.out.format("Total tip payed per person is $ %.2f", tipPP);
        System.out.println("");

        //The whole bill is split between everyone in order to see how much each person pays, stored as a double and rounded to the nearest hundredth
        double ePP = wholeBill/party;
        System.out.format("Everyone has to pay $ %.2f", ePP);
        System.out.println("");
    }
}