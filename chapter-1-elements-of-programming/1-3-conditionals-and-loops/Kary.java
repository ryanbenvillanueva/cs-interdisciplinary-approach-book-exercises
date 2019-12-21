/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Kary {
    public static void main(String[] args) {
        // read in the command-line argument
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);

        // set power to the largest power of k that is <= i
        int power = 1;
        while (power <= i / k) {
            power *= k;
        }

        // check for presence of powers of k in i, from largest to smallest
        while (power > 0) {

            // power is not present in i
            if (i < power) {
                System.out.print(0);
            }

            // power is present in i, so subtract power from i
            else {
                System.out.print(1);
                i -= power;
            }

            // next smallest power of k
            power /= k;
        }

        System.out.println();
    }
}
