/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.18 Write a program that takes two integer command-line arguments x and
 *  y and prints the Euclidean distance from the point (x, y) to the origin
 *  (0, 0).
 *  Last modified:     October 20, 2019
 **************************************************************************** */

public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double distance = Math.sqrt((y * y) + (x * x));
        System.out.println(distance);
    }
}
