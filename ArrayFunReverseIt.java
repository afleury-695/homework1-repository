

public class ArrayFunReverseIt {
    public static void main(String[] args) {
        /*This solution must be contained in a Java file called ```ArrayFunReverseIt```. Your code must declare
        the following array [1, 2, 3, 4, 5], create another array of equal length, and fill that array with values
        from the original array but in reverse order. Finally, your code must print the contents of both arrays to the screen.
         */

        int array[] = {1, 2, 3, 4, 5};

        int arrayTwo[] = {array[4], array[3], array[2], array[1], array[0]};

        int counterOne = 0;


        while (counterOne < 5) {
            System.out.println(array[counterOne]);
            counterOne++;
        }

        int counterTwo = 0;

        while (counterTwo < 5) {
            System.out.println(arrayTwo[counterTwo]);
            counterTwo++;
        }
    }
}





