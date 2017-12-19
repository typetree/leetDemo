package com.stream.practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by caifangyi on 2017/11/23.
 */
public class Demo03Filter {

    public static void main(String[] arg){

        //filter 对stream进行条件过滤，过滤成功的元素生成一个新的流
        Integer[] integers = {1, 2, 3, 4};
        Integer[] objects = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray(Integer[]::new);

        Arrays.stream(objects).forEach(System.out::println);
    }
}
