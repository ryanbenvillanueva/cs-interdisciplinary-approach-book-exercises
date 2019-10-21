/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.3.5 Write a program RollLoadedDie that prints the result of rolling a
 *  loaded die such that the probability of getting a 1, 2, 3, 4, or 5 is 1/8
 *  and the probability of getting a 6 is 3/8.
 *  Last modified:     October 21, 2019
 **************************************************************************** */

public class RollLoadedDie {
    public static void main(String[] args) {
        double r = Math.random();
        int roll;

        if (r < 1.0 / 8.0) {
            roll = 1;
        }
        else if (r < 2.0 / 8.0) {
            roll = 2;
        }
        else if (r < 3.0 / 8.0) {
            roll = 3;
        }
        else if (r < 4.0 / 8.0) {
            roll = 4;
        }
        else if (r < 5.0 / 8.0) {
            roll = 5;
        }
        else {
            roll = 6;
        }

        System.out.println(roll);

    }
}
