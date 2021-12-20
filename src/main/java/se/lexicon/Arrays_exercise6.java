package se.lexicon;


/**Write a program which will set up an array to hold the next values in this
        order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        Expected output: Average is: 17.3*/

public class Arrays_exercise6 {

    public static void main(String[] args) {

        double[] numbers = {43, 5, 23, 17, 2, 14};
        double Total = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            Total = Total + numbers[i];

        }
        double average = Total / numbers.length;

        System.out.format("The average is: %.1f", average);

    }
}
