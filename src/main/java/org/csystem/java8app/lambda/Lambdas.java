package org.csystem.java8app.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {
    //get the static list for operation
    private static List<Integer> ms_integers = new ArrayList<Integer>(Arrays.asList(4, 8, 3, 1, 18, 9, 21, 20, 5, 17));

    //her bir elemanı 2'y le çarpıp göstermek
    public static void eachValMultiplyBy2()
    {
        for (Integer val : ms_integers) {
            System.out.print(val * 2 + " ");
        }
    }

    //her bir elemanı 2'y le çarpıp göstermek
    public static List<Integer> eachValMultiplyBy2AndAssignList()
    {
        List<Integer> result = new ArrayList<Integer>();

        for (Integer val : ms_integers) {
            result.add(val * 2);
        }

        return result;
    }
}
