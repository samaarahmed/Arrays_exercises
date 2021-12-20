package se.lexicon;

import java.util.Arrays;

//Exercise 1
/**Write a program which will store elements in an array of type ‘int’ and
        print it out.
        Expected output: 11 23 39 etc.*/


public class App {
    public static void main(String[] args) {
        int[]numbers = new int[3];
              numbers[0]= 11;
              numbers[1]= 23;
              numbers[2]= 39;

               System.out.print(Arrays.toString(numbers));

            }
        }


