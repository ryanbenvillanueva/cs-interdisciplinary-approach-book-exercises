/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.21 Write a program that takes a double command-line argument t and
 *  prints the value of sin(2t)  sin(3t).
 *  Last modified:     October 12, 2019
 **************************************************************************** */

public class SumOfSines {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double value = Math.sin(2 * t) + Math.sin(3 * t);
        System.out.println(value);
    }
}
