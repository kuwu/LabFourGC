import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program uses the BigInterger to deal with numbers lager than 20. Using
 * long still would not let users enter large numbers.
 * Created by kuwu on 2017/06/28.
 */
public class LabFour {
    Scanner scnr = new Scanner(System.in);

    public void Factorial() {
        int num;
        int i;
        BigInteger fact = new BigInteger("1");
        BigInteger fact2 = new BigInteger("1");

        System.out.println("Enter a number");
        num = scnr.nextInt();

        if (num < 0)
            System.out.println("Please enter a positive number");
        else {
            for (i = 1; i <= num; i++) {

                fact = fact.multiply(fact2);
                fact2 = fact2.add(BigInteger.ONE);
            }
        }
        System.out.println(num + "! " + fact);

    }

    public static char getUserInput() {
        Scanner scnr = new Scanner(System.in); // create a scanner object
        System.out.println("Enter 'y' to continue or 'n' to quit");
        // cast uppercase to lowercase
        String userInput = scnr.next().toLowerCase();

        return userInput.charAt(0);
    }

    public static void printUserInfo() {
        LabFour check = new LabFour();
        check.Factorial();
    }

    public static void main(String[] args) {
        char userChar;
        boolean value = true;


        // runs Factorial one time before continue/check loop
        printUserInfo();


        // loop allows user to continue using 'y or Y' until the user
        // types 'n or N' to quit    validates for 'y or Y' and 'n or N'
        do {
            userChar = getUserInput();
            if (userChar == 'y') {
                printUserInfo();
            } else if (userChar == 'n') {
                value = false;
            } else {
                System.out.println(userChar + " is not y or n please re-enter");
            }

        } while (value);


        // Informing the user the program has ended
        System.out.print("Goodbye");

    }
}

