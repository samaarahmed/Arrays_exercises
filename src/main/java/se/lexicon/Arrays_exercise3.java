package se.lexicon;

import java.util.Arrays;

public class Arrays_exercise3 {
    public static void main (String[]args){

        /** Write a program which will sort string array.
        Expected output: String array: [Paris, London, New York, Stockholm]
        Sort string array: [London, New York, Paris, Stockholm]*/


        String [] Capitals = { "Paris", "London","New York", "Stockholm" };

        System.out.println("Capitals" + Arrays.toString(Capitals));
        Arrays.sort(Capitals);
        System.out.println("After Sorted:" + Arrays.toString(Capitals));
    }
}
