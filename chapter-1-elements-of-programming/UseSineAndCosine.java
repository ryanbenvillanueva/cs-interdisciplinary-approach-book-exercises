/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.2 Write a program that uses Math.sin() and Math.cos() to check that the
 *  value of cos2 (theta )+ sin2 (theta) is approximately 1 for any  entered
 *  as a command-line argument. Just print the value. Why are the values not
 *  always exactly 1?
 *  Last modified:     October 10, 2019
 **************************************************************************** */

public class UseSineAndCosine {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        double value = ((Math.cos(theta) * Math.cos(theta)) +
                (Math.sin(theta) * Math.sin(theta)));
        System.out.println(value);
    }
}
