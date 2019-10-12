/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.14 Write a program that takes two positive integers as command-line
 *  arguments and prints true if either evenly divides the other.
 *  Last modified:     October 10, 2019
 **************************************************************************** */

public class EvenlyDivide {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean evenlyDivides = ((a % b == 0) || (b % a == 0));
        
        System.out.println(evenlyDivides);
    }
}
