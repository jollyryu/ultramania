package com.ryu.ultramania;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class WhyJava8 {

    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final StringBuilder stringBuilder = new StringBuilder();

        final String result = numbers.stream()
                                     .map(String::valueOf)
                                     .collect(joining(" : "));

        System.out.println(result);
    }
}
