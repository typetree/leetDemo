package com.stream.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caifangyi on 2017/11/27.
 */
public class Demo10Match {

    public static void main(String[] args){

        /**
         *
         *   allMatch：Stream 中全部元素符合传入的 predicate，返回 true
             anyMatch：Stream 中只要有一个元素符合传入的 predicate，返回 true
             noneMatch：Stream 中没有一个元素符合传入的 predicate，返回 true
         */
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(5L);
        list.add(6L);
        list.add(7L);

        boolean b = list.stream().allMatch(n -> n <= 7);
        System.out.println(b);

        boolean c = list.stream().anyMatch(n -> n < 2);
        System.out.println(c);

        boolean d = list.stream().noneMatch(n -> n < 2);
        System.out.println(d);
    }
}
