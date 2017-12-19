package com.stream.practice;

import java.util.Arrays;

/**
 * Created by caifangyi on 2017/11/23.
 */
public class Demo08Sorted {

    public static void main(String[] args){

        String[] strings = {"d","b","a",  "c"};

        Arrays.stream(strings).limit(2).sorted((s1,s2) -> s1.compareTo(s2)).forEach(System.out::println);

    }
}
