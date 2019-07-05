import java.util.Scanner;

public class ValidNumber {

    /* Exercise 2: Valid Number (Loops)
    This program prompts the user for a number between 1 and 10 and keeps asking until the entered
    number is in range. Your solution must be in a Java file called ```ValidNumber```.

    The program must do the following:
            1. Prompt the user to enter a number between 1 and 10.
            1. If the user enters a number less than 1 or greater than 10, display the following
             error message and prompt the user for another entry: "You must enter a number between 1 and 10, please try again."
            1. When the user enters a valid number, print the number to the screen and exit. */

    public static void main(String[] args) {

        System.out.println("Please enter a number between 1 and 10.");

        //Setting up to receive user input
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        int input = scanner.nextInt();


        while (input <= 1 || input >= 10) {
            System.out.println("You must enter a number between 1 and 10, please try again.");

            //Setting up to receive user input
            Scanner scannerdos = new Scanner(System.in);

            //recieving user input
            input = scannerdos.nextInt();

            if(input >= 1 || input <= 10) {
                break;
            }
        }

        if(input >= 1 && input <= 10) {
            System.out.println(input);
        }

    }

    }


