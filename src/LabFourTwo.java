import java.util.Scanner;

/**
 * This program uses double instead of BigInterger and print formatting to take cake of the decimal point.
 *
 * Created by kuwu on 2017/06/28.
 */
public class LabFourTwo {

    public void Factor() {

    int num;
    int i;
    double fact = 0;

    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter a number");
    num =scnr.nextInt();

        if(num< 0)

    {
        System.out.println("Please enter a positive number");

    } else

    {

        for (i = 1; i <= num; i++) {

            fact = fact * i;
        }
        System.out.printf("%.0f %n" + num + "! " + fact);
    }

}
    public static char getUserInput() {
        Scanner scnr = new Scanner(System.in); // create a scanner object
        System.out.println("Enter 'y' to continue or 'n' to quit");
        // cast uppercase to lowercase
        String userInput = scnr.next().toLowerCase();

        return userInput.charAt(0);
    }

    public static void printUserInfo() {
        LabFourTwo check = new LabFourTwo();
        check.Factor();
    }

    public static void main(String[] args) {
        char userChar;
        boolean value = true;


        // runs Factor one time before continue/check loop
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
