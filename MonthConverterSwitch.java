import java.util.Scanner;

public class MonthConverterSwitch {
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


        switch (input) {

            case 1:
                System.out.println("JANUARY");
                break;

            case 2:
                System.out.println("FEBRUARY");
                break;

            case 3:
                System.out.println("MARCH");
                break;

            case 4:
                System.out.println("APRIL");
                break;

            case 5:
                System.out.println("MAY");
                break;

            case 6:
                System.out.println("JUNE");
                break;

            case 7:
                System.out.println("JULY");
                break;

            case 8:
                System.out.println("AUGUST");
                break;

            case 9:
                System.out.println("SEPTEMBER");
                break;

            case 10:
                System.out.println("OCTOBER");
                break;

            case 11:
                System.out.println("NOVEMBER");
                break;

            case 12:
                System.out.println("DECEMBER");
                break;

            default:
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
                break;


        }
    }
}
