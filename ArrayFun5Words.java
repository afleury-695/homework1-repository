import java.util.Scanner;
public class ArrayFun5Words {
    public static void main(String[] args) {

        //I HAD ISSUES WITH RENAMING THE CLASSES SO HERE IS THE INTEGER VERSION.  THE WORDS VERSION IS UNDER THE INTEGER VERSION. 
        /*
        This solution must be contained in a Java file called ```ArrayFun5Words```. Your code must get 5 words from the user,
        put them in an array, and print the array elements to the screen.
         */


        int array[] = {0, 1, 2, 3, 4};


        System.out.println("Please enter a number.");

        //Setting up to receive user input
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        int int0 = scanner.nextInt();

        array[0] = int0;

        System.out.println("Please enter a number.");

        //Getting user input
        int int1 = scanner.nextInt();

        array[1] = int1;

        System.out.println("Please enter a number.");

        //Getting user input
        int int2 = scanner.nextInt();

        array[2] = int2;

        System.out.println("Please enter a number.");

        //Getting user input
        int int3 = scanner.nextInt();

        array[3] = int3;

        System.out.println("Please enter a number.");

        //Getting user input
        int int4 = scanner.nextInt();

        array[4] = int4;

        int counterOne = 0;
        while(counterOne < 5) {
            System.out.println(array[counterOne]);
            counterOne++;
        }
    }

}
