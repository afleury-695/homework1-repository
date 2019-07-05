import java.util.Scanner;
public class MonthConverterIf {

    /*The program must do the following:
            1. Prompt the user to enter a number between 1 and 12.
            1. Print out the name of the month corresponding to the number typed in by the user.
            1. Print out the following error message if the user enters a number less than 1 or
            greater than 12: "You have entered an invalid number. You must enter a number between 1 and 12. Goodbye."
*/
    public static void main(String[] args) {

        System.out.println("Please enter a number.");

        //Setting up to receive user input
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        int input = scanner.nextInt();

        if (input > 0 && input < 13) {
            if (input == 1) {
                System.out.println("JANUARY");
            }
            if (input == 2) {
                System.out.println("FEBRUARY");
            }
            if (input == 3) {
                System.out.println("MARCH");
            }
            if (input == 4) {
                System.out.println("APRIL");
            }
            if (input == 5) {
                System.out.println("MAY");
            }
            if (input == 6) {
                System.out.println("JUNE");
            }
            if (input == 7) {
                System.out.println("JULY");
            }
            if (input == 8) {
                System.out.println("AUGUST");
            }
            if (input == 9) {
                System.out.println("SEPTEMBER");
            }
            if (input == 10) {
                System.out.println("OCTOBER");
            }
            if (input == 11) {
                System.out.println("NOVEMBER");
            }
            if (input == 12) {
                System.out.println("DECEMBER");


            }
        } else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");

        }
    }
}







