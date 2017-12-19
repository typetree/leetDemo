package com.stream.practice;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by caifangyi on 2017/11/23.
 */
public class Demo06Reduce {

    public static void main(String[] args){

        //reduce
        //字符串连接
        String reduce = Stream.of("A", "B", "C", "D").reduce("str:", String::concat);
        System.out.println(reduce.concat(" end"));

        //求最小值
        Integer reduce1 = Stream.of(1, 2, 3, 4).reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(reduce1);

        //求和,有初始值
        Integer reduce2 = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        System.out.println(reduce2);

        //求和，无初始值
        Optional<Integer> reduce3 = Stream.of(1, 2, 3, 4, 5).reduce(Integer::sum);
        System.out.println(reduce3.get());
    }
}
