package org.csystem.java8app.app;

import org.csystem.java8app.lambda.Lambdas;

import java.util.List;

public class App {
    public static void main(String[] args)
    {
        List<Integer> result = Lambdas.eachValMultiplyBy2AndAssignList();
        System.out.println(result);

        /*
            System.out.println(Lambdas.eachValMultiplyBy2AndAssignList());
        */
    }
}
