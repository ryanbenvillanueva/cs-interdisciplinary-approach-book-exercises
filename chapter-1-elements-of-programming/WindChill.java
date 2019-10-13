/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.25 Wind chill. Given the temperature T (in degrees Fahrenheit) and the
 *  wind speed v (in miles per hour), the National Weather Service defines the
 *  effective temperature (the wind chill) as follows:
 *  w = 35.74  0.6215 T  (0.4275 T  35.75) v 0.16
 *  Write a program that takes two double command-line arguments temperature
 *  and velocity and prints the wind chill. Use Math.pow(a, b) to compute ab.
 *  Note: The formula is not valid if T is larger than 50 in absolute value or
 *  if v is larger than 120 or less than 3 (you may assume that the values you
 *  get are in that range).
 *  Last modified:     October 13, 2019
 **************************************************************************** */

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double windChill = 35.74 + (0.6215 * t) +
                (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
        System.out.println(windChill);
    }
}
