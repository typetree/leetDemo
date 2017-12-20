package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by caifangyi on 2017/11/21.
 */
public class No1TwoSum {

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.
     Given nums = [2, 7, 11, 15], target = 9,
     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].
     * @param args
     */
    public static void main(String[] args){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum2(nums, target);
        IntStream.of(ints).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();

        a:for(int i=0 ; i < nums.length-1 ; i++){

            for(int j=i+1; j < nums.length; j++ ){

                if(nums[i] + nums[j] == target){
                    list.add(i);
                    list.add(j);
                    break a;
                }

            }
        }

        int[] ints = list.stream().mapToInt(i -> (int)i).toArray();
        return ints;
    }

    public static int[] twoSum2(int[] giv, int target) {
        HashMap<Integer, Integer> mapper = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        for (int i = 0; i < giv.length; i++){
            int num = target - giv[i];
            if (mapper.containsKey(target-num)){
                ans[0] = mapper.get(target-num);
                ans[1] = i;
                break;
            }
            else if (!mapper.containsKey(num)){
                mapper.put(num, i);
            }
        }
        return ans;
    }
}
