package org.dcistudent;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Main.exercise1();
        Main.exercise2();
    }

    /**
     * Exercise 1.
     *
     * 1. Check if the following strings are blank:
     * "Hello"
     * " "
     * null
     * 2. Reverse the string "ApacheLang".
     * 3. Abbreviate the string "Apache Commons Lang3 is amazing!" to 15 characters.
     */
    private static void exercise1() {
        List<String> strings = new ArrayList<>(Arrays.asList("Hello", " ", null));
        strings.forEach(
            string -> System.out.println("Is blank: " + StringUtils.isBlank(string))
        );

        System.out.println("Reversed: " + StringUtils.reverse("ApacheLang"));
        System.out.println("Abbreviated: " + StringUtils.abbreviate("Apache Commons Lang3 is amazing!", 15));
    }

    /**
     * 1. Create an array of integers {1, 2, 3, 4, 5}.
     * 2. Check if the array contains the number 4.
     * 3. Reverse the array and print the result.
     */
    private static void exercise2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Contains 4: " + StringUtils.contains(numbers.toString(), "4"));
        System.out.println("Reversed: " + StringUtils.reverse(numbers.toString()));
    }
}