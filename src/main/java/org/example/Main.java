package org.example;

import org.w3c.dom.Node;

/**
 * @author Levantosina
 */
public class Main {
    public static void main(String[] args) {

//        int[] nums = {1,3,4,2};
//        int target = 6;
//        TwoSum twoSum=new TwoSum();
//        int[]result=twoSum.twoSumTask(nums,target);
//        //System.out.println(result[0]+", "+result[1]);;
//
//        Palindrome palindrome=new Palindrome();
//        boolean result2=palindrome.isPalindrome(11);
//
//        System.out.println(result2);
////////////////////////////////////////////////////////////////////////////////////////

//        int[] data = { 1,2,2,1 };
//        PalindromeLinkedList palindromeLinkedList=new PalindromeLinkedList();
//
//        PalindromeLinkedList.ListNode head=null;
//
//        for (int i = data.length - 1; i >= 0; i--) {
//            head = new PalindromeLinkedList.ListNode(data[i],head);
//        }
//
//
//        boolean result3=palindromeLinkedList.isPalindrome(head);
//        System.out.println(result3);
//
//
//        PairsInArray pairsInArray=new PairsInArray();
//        int[] nums2 = {13,10,35,24,76};
//        int result4=pairsInArray.countNicePairs(nums2);
//        System.out.println(result4);

        RomanToInt romanToInt=new RomanToInt();
        int result5=romanToInt.romanToInt("MCMXCIV");
        System.out.println(result5);
    }
}
