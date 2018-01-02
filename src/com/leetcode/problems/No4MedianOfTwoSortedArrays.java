package com.leetcode.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by caifangyi on 2017/12/28.
 */
public class No4MedianOfTwoSortedArrays {

/*
    There are two sorted arrays nums1 and nums2 of size m and n respectively.

    Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

    Example 1:
    nums1 = [1, 3]
    nums2 = [2]

    The median is 2.0
    Example 2:
    nums1 = [1, 2]
    nums2 = [3, 4]

    The median is (2 + 3)/2 = 2.5
*/

    public static void main(String[] args){

        No4MedianOfTwoSortedArrays no4MedianOfTwoSortedArrays = new No4MedianOfTwoSortedArrays();

        int[] num1 = {1, 2};
        int[] num2 = {3,4};

        double medianSortedArrays2 = no4MedianOfTwoSortedArrays.findMedianSortedArrays2(num1, num2);
        System.out.println(medianSortedArrays2);

    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        List<Integer> nums1List = Arrays.stream(nums1)
                .mapToObj(value -> Integer.valueOf(value))
                .collect(Collectors.toList());

        List<Integer> nums2List = Arrays.stream(nums2)
                .mapToObj(value -> Integer.valueOf(value))
                .collect(Collectors.toList());

        Stream<List<Integer>> listStream = Stream.of(nums1List, nums2List);

        List<Integer> list = listStream.flatMap(integers -> integers.stream())
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());

        Double index = Double.valueOf((m + n)) / 2;
        int i = index.intValue();
        if((m+n)%2==0){
            return Double.valueOf(list.get(i)+list.get(i-1))/2;
        }else{
            return Double.valueOf(list.get(index.intValue()));
        }

    }

//
//    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
//
//        int m = nums1.length;
//        int n = nums2.length;
//
//        int nums1Head = nums1[0];
//        int nums1Tail = nums1[m-1];
//
//        int nums2Head = nums2[0];
//        int nums2Tail = nums2[n-1];
//
//        if(nums1Tail <= nums2Head){
//
//            Double index = Double.valueOf((m + n)) / 2;
//            if((m+n)%2!=0){
//                int i = index.intValue();
//                if(index < m){
//                    return Double.valueOf(nums1[i]+nums1[i+1])/2;
//                }else{
//                    return Double.valueOf(nums2[i]+nums2[i+1])/2;
//                }
//            }else{
//                if(index <= m){
//                    return nums1[index.intValue()];
//                }else{
//                    return nums2[index.intValue()];
//                }
//            }
//        }else if(nums2Tail <= nums1Head){
//
//            Double index = Double.valueOf((m + n)) / 2;
//            if((m+n)%2!=0){
//                int i = index.intValue();
//                if(index < n){
//                    return Double.valueOf(nums2[i]+nums2[i+1])/2;
//                }else{
//                    return Double.valueOf(nums1[i]+nums1[i+1])/2;
//                }
//            }else{
//                if(index <= n){
//                    return nums2[index.intValue()];
//                }else{
//                    return nums1[index.intValue()];
//                }
//            }
//        }
//    }
}
