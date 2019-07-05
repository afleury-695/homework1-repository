import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {

        //I ACCIDENTALLY DID THE WORDS ONE HERE AND THE INTEGER ONE UNDER THE WORDS ONE.  I TRIED TO RENAME IT
        //BUT IT DID NOT COOPERATE WITH ME.

        /*1. This solution must be contained in a Java file called ```ArrayFunUserArray```.
                Your code must read 5 ints from the user, put them in an array, and print
        the array elements to the screen. */

        String array[] = {"placeholder", "placeholder", "placeholder", "placeholder", "placeholder"};


        System.out.println("Please enter a word.");

        //Setting up to receive user input
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        String int0 = scanner.nextLine();

        array[0] = int0;

        System.out.println("Please enter a word.");

        //Getting user input
        String int1 = scanner.nextLine();

        array[1] = int1;

        System.out.println("Please enter a word.");

        //Getting user input
        String int2 = scanner.nextLine();

        array[2] = int2;

        System.out.println("Please enter a word.");

        //Getting user input
        String int3 = scanner.nextLine();

        array[3] = int3;

        System.out.println("Please enter a word.");

        //Getting user input
        String int4 = scanner.nextLine();

        array[4] = int4;

        int counterOne = 0;
        while (counterOne < 5) {
            System.out.println(array[counterOne]);
            counterOne++;

        }
    }
}
