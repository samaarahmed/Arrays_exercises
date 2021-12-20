package se.lexicon;

import java.sql.SQLOutput;
import java.util.Arrays;

/**Create a program and create a method with name ‘indexOf’ which will
        find and return the index of an element in the array. If the element
        doesn’t exist your method should return -1 as value.
        Expected output: Index position of number 5 is: 2.*/

public class Arrays_exercise2 {
    public static void main(String[] args) {
    int indexFound;

        indexof(23);


    }

    public static int indexof(int indextofind) {
        int[] numbers = {12, 3, 5, 4, 10, 22};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int indexFound = Arrays.binarySearch(numbers, indextofind);
        //int indexNotFound = Arrays.binarySearch(numbers, indextofind);

        if (indexFound >= 0 && indexFound <= numbers.length ) {

            System.out.println("Index position of no is : " + indexFound);
            return indexFound;
        } else {
            System.out.println("indexNotFound");
            return -1;
            //System.out.println("Index position of no 5 is : " + indexFound);

        }
    }
}



