package com.kristoffer.demo;

import com.kristoffer.demo.sealedExamples.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }


    public static void recordAndEquals() {
        StudentExample benny = new StudentExample(
                "Benny",
                15,
                true
        );
        Student frida = new Student(
                "Frida",
                15,
                false
        );

        Test test1 = new Test("test1");
        Test test2 = new Test("test1");

        // equals
        System.out.println(test1.equals(test2));
        System.out.println(test2.equals(test1));

        System.out.println(benny);
        System.out.println(frida);

        // String example

        String x = "Benny";
        String y = "Benny";

        if (x.equals(y)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        // String Examples - TextBlocks

        String textBlock1 = """
                HELLO
                THERE
                """;
        String textBlock2 = """
                HELLO
                THERE
                """;

        System.out.println(textBlock1.equals(textBlock2));

    }

    public static void enhancedSwitches() {

        List<Integer> scoreList = new ArrayList<>(
                Arrays.asList(0, 15, 25, 50)
        );

        scoreList.forEach(
                (i) -> {
                    System.out.println("Value: ");
                    System.out.println(i);
                }
        );
        // scoreList.forEach(System.out::println);



        /*
        for (int i = 0; i < scoreList.size(); i++) {
            System.out.println(scoreList.get(i));
        }*/

        int dayOfTheWeek = 5;

        switch (dayOfTheWeek) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }

    public static void sealedExamples() {
        Cat cat = new Cat("Benny");

        cat.setName("TEST");

        System.out.println(cat.getName());
    }

    public static void textBlockExample() {
        System.out.println("""
                SELECT ___
                FROM ____
                WHERE ___
                ORDER BY ___
                """);
    }

    public static void patternMatchingExample() {
/*
        String formatted = switch (o) {
            case Integer i when i > 10 -> String.format("a large Integer %d", i);
            case Integer i             -> String.format("a small Integer %d", i);
            case Long l                -> String.format("a Long %d", l);
            default                    -> o.toString();
        };
 */

        String test = "Hey";
        //String test2 = STR.""; // Java 21

    }
}
