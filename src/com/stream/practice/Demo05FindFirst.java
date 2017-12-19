package com.stream.practice;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by caifangyi on 2017/11/23.
 */
public class Demo05FindFirst {

    public static void main(String[] args){

        //返回stream的第一个元素，或者空
        //返回类型为Optional
        String[] strings = {"a", "b"};
        Optional<String> first = Arrays.stream(strings).findFirst();

        String aNull = first.orElse("null");

        String s = first.get();

    }
}
