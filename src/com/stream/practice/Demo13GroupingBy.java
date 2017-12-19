package com.stream.practice;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by caifangyi on 2017/11/28.
 */
public class Demo13GroupingBy {

    public static void main(String[] args){

        Map<Integer, List<Student>> collect = Stream.generate(new StudentSupplier())
                .limit(20)
                .collect(Collectors.groupingBy(Student::getAge));
        Iterator<Map.Entry<Integer, List<Student>>> iterator = collect.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, List<Student>> entry = iterator.next();
            Integer key = entry.getKey();
            List<Student> value = entry.getValue();
            value.stream().forEach(stu -> System.out.println(stu.getName()+","+stu.getAge()));
        }

    }

    public static class StudentSupplier implements Supplier<Student> {

        private Random random = new Random();

        private int index = 0;

        @Override
        public Student get() {
            return new Student("test"+index,random.nextInt(10));
        }
    }



}

class Student{

    private String name;

    private Integer age;

    public Student(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

