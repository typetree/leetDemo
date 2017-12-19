package com.stream.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by caifangyi on 2017/11/23.
 */
public class Demo04Foreach {

    public static void main(String[] arg){

        //foreach循环
        Integer[] integers = {1, 2, 3, 4,5,6,12};

        Arrays.stream(integers).filter(n -> n%2 ==0).filter(n -> n%3 ==0).forEach(n -> System.out.println(n));


        //peek
        //和foreach功能类型，但是是中间操作intermediate ，需要终止操作terminal才能生效。
        Arrays.stream(integers).filter(n -> n%4 == 0).peek(n -> System.out.println(n)).collect(Collectors.toList());

    }

}
