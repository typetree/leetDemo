package com.demo20171121;

/**
 * Created by caifangyi on 2017/11/21.
 */
public class demo01 {

    /**
     * 写一个程序，打印数字1到100，
     * 3的倍数打印“Fizz”来替换这个数，5的倍数打印“Buzz”，
     * 对于既是3的倍数又是5的倍数的数字打印“FizzBuzz”。
     * @param args
     */
    public static void main(String args[]){

        for(int i = 1; i <= 100; i++){
            String temp = "";
            if(i%3 == 0 ){
                temp += "Fizz";
            }
            if(i%5 == 0){
                temp += "Buzz";
            }
            System.out.println(temp!=""?temp:i+"");
        }
    }
}
