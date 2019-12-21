/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.33 Great circle. Write a program GreatCircle that takes four double
 * command-line arguments—x1, y1, x2, and y2—(the latitude and longitude,
 *  in degrees, of two points on the earth) and prints the great-circle distance
 *  between them. The great-circle distance (in nautical miles) is given by the
 *  following equation:
 *  d = 60 arccos(sin(x1) sin(x2) + cos(x1) cos(x2) cos(y1 - y2))
 *  Note that this equation uses degrees, whereas Java’s trigonometric functions
 *  use radians. Use Math.toRadians() and Math.toDegrees() to convert between
 *  the two. Use your program to compute the great-circle distance between
 *  Paris (48.87° N and 2.33° W) and San Francisco (37.8° N and 122.4° W).
 *  Last modified:     19/10/2019
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double d = 60 * Math.acos(Math.sin(x1) * Math.sin(x2) +
                                          Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The great circle distance between Paris and San"
                                   + " Francisco is " + Math.toDegrees(d) + " nautical miles");

        // double r = 6371.0;
        // double sqrRoot = Math
        //         .sqrt(Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2) +
        //                       (Math.cos(x1) * Math.cos(x2) *
        //                               (Math.sin((y2 - y1) / 2) * Math.sin((y2 - y1) / 2))));
        // double arcsin = Math.asin(sqrRoot);
        // double distance = 2 * r * arcsin;
        // System.out.println(distance + " kilometers");
    }
}
