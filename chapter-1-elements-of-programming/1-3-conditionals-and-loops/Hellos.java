/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.3.8 Rewrite TenHellos to make a program Hellos that takes the number of
 *  lines to print as a command-line argument. You may assume that the argument
 *  is less than 1000. Hint: Use i % 10 and i % 100 to determine when to use st,
 *  nd, rd, or th for printing the ith Hello.
 *  Last modified:     October 22, 2019
 **************************************************************************** */

public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        while (i <= n) {
            if (i % 100 >= 11 && i % 100 <= 20) {
                System.out.println(i + "th Hello");
            }
            else if (i % 10 == 1) {
                System.out.println(i + "st Hello");
            }
            else if (i % 10 == 2) {
                System.out.println(i + "nd Hello");
            }
            else if (i % 10 == 3) {
                System.out.println(i + "rd Hello");
            }
            else {
                System.out.println(i + "th Hello");
            }
            i = i + 1;
        }

    }
}
