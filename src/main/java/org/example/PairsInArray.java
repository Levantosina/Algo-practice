package org.example;

import java.util.Stack;

/**
 * @author Levantosina
 */
public class PairsInArray {
    public int countNicePairs(int[] nums) {

        int count=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])){
                    count++;
                }
            }

        }
        return count;

    }

    public static int rev(int n) {

        String numAsString = String.valueOf(n);
        Stack<Character> stack = new Stack<>();
        for (char c : numAsString.toCharArray()) {
            stack.push(c);
        }

        StringBuilder rev = new StringBuilder();
        while (!stack.isEmpty()) {
            rev.append(stack.pop());
        }
        return Integer.parseInt(rev.toString());
    }
}