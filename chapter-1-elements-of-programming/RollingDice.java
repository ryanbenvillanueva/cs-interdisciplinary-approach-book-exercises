/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.2.20 Write a program that prints the sum of two random integers between
 *  1 and 6 (such as you might get when rolling dice).
 *  Last modified:     October 12, 2019
 **************************************************************************** */

public class RollingDice {
    public static void main(String[] args) {
        int randNumX = (int) (Math.random() * 6) + 1;
        int randNumY = (int) (Math.random() * 6) + 1;
        int sum = randNumX + randNumY;
        System.out.println(sum);
    }
}
