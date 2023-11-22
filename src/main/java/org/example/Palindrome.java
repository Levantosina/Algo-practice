package org.example;

import org.w3c.dom.Node;

import java.util.Stack;

/**
 * @author Levantosina
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        int r;
        int reversed = 0;
        int temp = x;

        if (x < 0) {
            return false;
        };

        while (x > 0) {
            r = x % 10;
            reversed = reversed * 10 + r;
            x /= 10;
        }
        if(temp==reversed){
            return true;
        }
        else{
            return false;
        }
    }
}
