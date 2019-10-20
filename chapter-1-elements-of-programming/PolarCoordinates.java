/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.26 Polar coordinates. Write a program that converts from Cartesian
 *  to polar coordinates. Your program should accept two double commandline
 *  arguments x and y and print the polar coordinates r and . Use the
 *  method Math.atan2(y, x) to compute the arctangent value of y/x that is
 *  in the range from -pi to pi.
 *  Last modified:     October 13, 2019
 **************************************************************************** */

public class PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double theta = Math.atan2(y, x);
        double r = Math.sqrt((x * x) + (y * y));

        System.out.println("The point (" + x + "," + y + ") is "
                                   + "(" + r + "," + theta + ") "
                                   + "in Polar Coordinates.");
    }
}
