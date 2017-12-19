package com.stream.practice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by caifangyi on 2017/11/23.
 */
public class Demo01CreateStream {

    public static void main(String[] args){

        //将多个参数转成流 Stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<String> stringStream = Stream.of("a", "b", "c");
        Stream<? extends Serializable> stream = Stream.of(1, "a", 2L);



        //将数组转成流 Arrays.stream(int[])
        //将list转成流 Collection.stream()
        int[] ints = new int[]{1, 2, 3};
        List<int[]> ints1 = Arrays.asList(ints);

        Integer[] integers = new Integer[]{1, 2, 3};
        List<Integer> integers1 = Arrays.asList(integers);

        String [] strArray = new String[] {"a", "b", "c"};
        List<String> strings = Arrays.asList(strArray);


        IntStream intStream = Arrays.stream(ints);
        Stream<int[]> stream1 = ints1.stream();
//        IntStream stream2 = ints1.stream();

        Stream<Integer> stream2 = Arrays.stream(integers);
        Stream<Integer> stream3 = integers1.stream();

        Stream<String> stream4 = Arrays.stream(strArray);
        Stream<String> stream5 = strings.stream();



    }

}
