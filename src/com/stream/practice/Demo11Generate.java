package com.stream.practice;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by caifangyi on 2017/11/28.
 */
public class Demo11Generate {

    public static void main(String[] args){

        //实现 Supplier 接口，控制流的生成
        //在管道中，必须利用 limit 之类的操作限制 Stream 大小

        Random random = new Random();

        Supplier<Integer> runnable = random::nextInt;

        Stream.generate(runnable).limit(10).forEach(System.out::println);
    }

}
