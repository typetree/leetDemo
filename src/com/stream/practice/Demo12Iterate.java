package com.stream.practice;

import java.util.stream.Stream;

/**
 * Created by caifangyi on 2017/11/28.
 */
public class Demo12Iterate {

    public static void main(String[] args){

        Stream.iterate(1,n->n+2).limit(12).forEach(System.out::println);

    }


}
