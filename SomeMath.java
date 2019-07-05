

public class SomeMath {

    public static void main(String[] args) {


       /* Exercise 3: Some Math (Methods)
                In this program, you will create three methods and call them from ```main``` with the
                specified parameters. Your solution must be in a Java file called ```SomeMath```.

        1. Create a method called ```total5```.  This method must take 5 int parameters and return
            the total. You must call the method with the following parameters and print the returned
        total to the screen: 1, 2, 3, 4, 5.
        1. Create a method called ```average5```. This method must take 5 int parameters and return
            the average of the numbers as a double. You must call the method with the following parameters
        and print the returned average to the screen: 1, 3, 5, 7, 9.
        1. Create a method called ```largest5```. This method must take 5 double parameters and return the
        largest. You must call the method with the following parameters and print the returned value to the
        screen: 42.0, 35.1, 2.3, 40.2, 15.6. */

        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        int var4 = 4;
        int var5 = 5;
        int sum = 0;

        double avg1 = 1.0;
        double avg2 = 3.0;
        double avg3 = 5.0;
        double avg4 = 7.0;
        double avg5 = 9.0;
        double sum2 = 0.0;

        double lar1 = 42.0;
        double lar2 = 35.1;
        double lar3 = 2.3;
        double lar4 = 40.2;
        double lar5 = 15.6;
        double sum3 = 0.0;


        SomeMath.total5(var1, var2, var3, var4, var5, sum);

        SomeMath.averages(avg1, avg2, avg3, avg4, avg5, sum2);

        SomeMath.largest5(lar1, lar2, lar3, lar4, lar5, sum3);

    }

    public static int total5(int var1, int var2, int var3, int var4, int var5, int sum) {
        sum = var1 + var2 + var3 + var4 + var5;
        System.out.println("The total for method total5 is " + sum);
        return sum;

    }

    public static void averages(double avg1, double avg2, double avg3, double avg4, double avg5, double sum2) {
        sum2 = (avg1 + avg2 + avg3 + avg4 + avg5);
        System.out.println("The average of averages method is " + sum2 / 5);
    }

    //public static int largest5(double lar1, double lar2, double lar3, double lar4, double lar5, double sum3) {
    //System.out.println(SomeMath.max(lar1, lar2, lar3, lar4, lar5));

    /*public static int largest5(double largest[], double sum3) {
        if (sum3 < largest[0]) ;
        sum3 = largest[0];
        if (sum3 < largest[1]) ;
        sum3 = largest[1];
        if (sum3 < largest[2]) ;
        sum3 = largest[2];
        if (sum3 < largest[3]) ;
        sum3 = largest[3];
        if (sum3 < largest[4]) ;
        sum3 = largest[4];
        System.out.println(sum3); */

        public static void largest5(double lar1, double lar2, double lar3, double lar4, double lar5, double sum3) {
            if(sum3 < lar1) {
                sum3 = lar1;
            }
            if(sum3 < lar2) {
                sum3 = lar2;
            }
            if(sum3 < lar3) {
                sum3 = lar3;
            }
            if(sum3 < lar4) {
                sum3 = lar4;
            }
            if(sum3 < lar5) {
                sum3 = lar5;
            }
            System.out.println("The largest number in method largest5 is " + sum3);
    }
}







