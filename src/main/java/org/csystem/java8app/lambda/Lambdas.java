package org.csystem.java8app.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {
    //get the static list for operation
    private static List<Integer> ms_integers = new ArrayList<Integer>(Arrays.asList(4, 8, 3, 1, 18, 9, 21, 20, 5, 17));

    //c-based print
    public static void printListC()
    {
        System.out.print("PrintListCBasedApproach> ");

        for (int i = 0; i < ms_integers.size(); ++i)
            System.out.print(ms_integers.get(i) + " ");

        System.out.println();
    }

    //java-based print foreach, advanced for
    public static void printListJava()
    {
        System.out.print("PrintListJavaBasedApproachAdvancedFor> ");

        for (Integer val : ms_integers)
            System.out.print(val + " ");

        System.out.println();
    }

    //usual way toString
    public static void printList()
    {
        System.out.print("PrintListUsualWay> ");
        System.out.println(ms_integers); //ms_integers.toString(), call dinamic type toString()
    }
}
