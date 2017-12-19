package com.stream.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by caifangyi on 2017/11/23.
 */
public class Demo02MapFlatMap {

    public static void main(String[] args){

        //map 对流中的每一个元素进行操作
        String[] strings = {"a", "b", "c"};
        List<String> strings1 = Arrays.asList(strings);

        List<String> collect = strings1.stream().map(String::toUpperCase).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        List<String> collect1 = strings1.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        collect1.stream().forEach(System.out::println);

        //flatMap
        //将多个同类型流合并成一个流
        Stream<List<Integer>> listStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> integerStream = listStream.flatMap(list -> list.stream());

    }
}
