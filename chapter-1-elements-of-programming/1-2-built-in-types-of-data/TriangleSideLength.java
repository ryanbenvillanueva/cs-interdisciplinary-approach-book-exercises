/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.15 Write a program that takes three positive integers as command-line
 *  arguments and prints false if any one of them is greater than or equal to
 *  the sum of the other two and true otherwise. (Note: This computation tests
 *  whether the three numbers could be the lengths of the sides of some
 *  triangle.)
 *  Last modified:     October 10, 2019
 **************************************************************************** */

public class TriangleSideLength {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean areSideLengths = ((a >= b + c) || (b >= a + c) ||
                (c >= a + b));

        System.out.println(!areSideLengths);
    }
}
