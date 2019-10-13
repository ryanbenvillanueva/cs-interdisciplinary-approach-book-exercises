/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.22 Write a program that takes three double command-line arguments x0,
 *  v0, and t and prints the value of x0  v0t − g t 2  2, where g is the
 *  constant 9.80665. (Note: This value is the displacement in meters after
 *  t seconds when an object is thrown straight up from initial position x0
 *  at velocity v0 meters per second.)
 *  Last modified:     October 13, 2019
 **************************************************************************** */

public class Displacement {
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;
        double value = x0 + (v0 * t) - ((g * t * t) / 2);
        System.out.println(value);
    }
}
