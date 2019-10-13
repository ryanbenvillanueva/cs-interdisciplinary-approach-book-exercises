/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.24 Continuously compounded interest. Write a program that calculates
 *  and prints the amount of money you would have after t years if you invested
 *  P dollars at an annual interest rate r (compounded continuously). The
 *  desired value is given by the formula P * e^rt.
 *  Last modified:     October 13, 2019
 **************************************************************************** */

public class ContinuouslyCompoundedInterest {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);     // invested dollars
        double t = Double.parseDouble(args[1]);     // time in years
        double r = Double.parseDouble(args[2]);     // annual interest rate
        double amount = p * Math.pow(Math.E, r * t);
        System.out.println(amount);
    }
}
