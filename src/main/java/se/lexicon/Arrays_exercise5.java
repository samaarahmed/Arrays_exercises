package se.lexicon;

import java.util.Arrays;

/**Create a two-dimensional string array [2][2]. Assign values to the 2d
        array containing any Country and City.
        Expected output:  France Paris
        Sweden Stockholm*/
public class Arrays_exercise5 {
    public static void main ( String[]args){

        String [][] CC = {{"France","Paris"},
                      {"Sweden"," Stockholm"}};
               for (int i = 0 ; i < CC.length ; i++)
        {
            System.out.println(Arrays.toString(CC[i]));
        }

    }
}
