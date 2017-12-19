package com.stream.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by caifangyi on 2017/11/23.
 */
public class Demo07LimitSkip {

    public static void main(String[] args){

        //limit 返回前面n个元素
        //skip  扔掉前n个元素
        Stream.of(1,2,3,4,5,6).limit(3).skip(1).collect(Collectors.toList()).forEach(System.out::println);

    }
}
