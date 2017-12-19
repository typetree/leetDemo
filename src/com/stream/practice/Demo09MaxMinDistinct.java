package com.stream.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by caifangyi on 2017/11/27.
 */
public class Demo09MaxMinDistinct {

    public static void main(String[] args){

        try {

            FileReader fileReader = new FileReader("E:\\logs\\basic-query-jcdebug.log");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

//            OptionalInt max = bufferedReader.lines().mapToInt(String::length).max();
//
//            int asInt = max.getAsInt();
//
//            System.out.println(asInt);

            List<String> collect = bufferedReader.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .filter(word -> word.length()>0)
                    .map(String::toLowerCase)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            collect.forEach(System.out::println);

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
