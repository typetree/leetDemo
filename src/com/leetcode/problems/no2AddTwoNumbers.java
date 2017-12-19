package com.leetcode.problems;

import java.util.List;

/**
 * Created by caifangyi on 2017/12/18.
 */
public class no2AddTwoNumbers {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.

     You may assume the two numbers do not contain any leading zero, except the number 0 itself.

     Example

     Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     Output: 7 -> 0 -> 8
     Explanation: 342 + 465 = 807.
     */
    public static void main(String args[]){

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

//        ListNode l1 = new ListNode(5);
//
//
//        ListNode l2 = new ListNode(5);

//        ListNode listNode = addTwoNumbers(l1, l2,0);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode.toString());
    }


    private static ListNode addTwoNumbers( ListNode l1, ListNode l2, Integer other) {

        Integer v1 = 0;
        Integer v2 = 0;
        if(null != l1){
            v1 = l1.val;
        }
        if(null != l2){
            v2 = l2.val;
        }
        Integer num = v1 + v2 + other;

        Integer val = num % 10;
        other = num / 10;

        ListNode listNode = new ListNode(val);

        Boolean flag1 =false;
        if(null == l1 || null == l1.next){
            flag1 = true;
        }
        Boolean flag2 =false;
        if(null == l2 || null == l2.next){
            flag2 = true;
        }
        if(flag1 && flag2 && other == 0){
            return listNode;
        }

        ListNode nextListNode = addTwoNumbers(flag1 ? null : l1.next, flag2 ? null : l2.next, other);
        listNode.next = nextListNode;
        return listNode;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode dummyhead = new ListNode(0);
        ListNode d = dummyhead;
        int sum = 0;
        while( c1 != null || c2 != null){
            sum = sum / 10;
            if(c1 != null){
                sum += c1.val;
                c1 = c1.next;
            }
            if(c2 != null){
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
//            d = new ListNode(sum % 10);
        }
        if(sum >= 10) d.next = new ListNode(1);
        return dummyhead.next;
    }

}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}