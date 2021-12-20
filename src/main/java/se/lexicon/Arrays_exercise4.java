package se.lexicon;

import java.util.Arrays;

/**Write a program which will copy the elements of one array into another
        array.
        Expected output: Elements from first array: 1 15 20
        Elements from second array: 1 15 20*/
public class Arrays_exercise4 {

    public static void main ( String[]args){

    int [] numbers = {1,15,20};
    int [] numbers1 = Arrays.copyOf(numbers,3);
        System.out.println("Elements of first array:"+ Arrays.toString(numbers));
        System.out.println("Elements of second array:"+Arrays.toString(numbers1));

    }
}
