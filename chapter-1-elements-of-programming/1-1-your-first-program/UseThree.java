/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  1.1.6 Modify UseArgument.java to make a program UseThree.java that takes
 *  three names as command-line arguments and prints a proper sentence with the
 *  names in the reverse of the order given, so that, for example, java UseThree Alice
 *  Bob Carol prints Hi Carol, Bob, and Alice.
 *  Last modified:     October 20, 2019
 **************************************************************************** */

/******************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument yourname
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *
 ******************************************************************************/

public class UseThree {

    public static void main(String[] args) {
        System.out.println("Hi " + args[2] + ", " + args[1] + ", and " + args[0] + ".");
    }

}
