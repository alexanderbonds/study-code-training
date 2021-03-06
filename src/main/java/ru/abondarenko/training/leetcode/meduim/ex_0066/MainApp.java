package ru.abondarenko.training.leetcode.meduim.ex_0066;

//  https://leetcode.com/problems/plus-one/
//
//  Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
//  The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
//  You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//  Example 1:
//  Input: digits = [1,2,3]
//  Output: [1,2,4]
//  Explanation: The array represents the integer 123.
//
//  Example 2:
//  Input: digits = [4,3,2,1]
//  Output: [4,3,2,2]
//  Explanation: The array represents the integer 4321.
//
//  Example 3:
//  Input: digits = [0]
//  Output: [1]

public class MainApp {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        int transferDigit = 0;
        digits[digits.length - 1]++;

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + transferDigit;
            if (digits[i] > 9) {
                digits[i] = 0;
                transferDigit = 1;
            } else {
                transferDigit = 0;
            }
        }

        if (transferDigit == 1) {
            int[] tmpArr = new int[digits.length + 1];
            tmpArr[0] = 1;
            System.arraycopy(digits, 0, tmpArr, 1, digits.length);
            digits = tmpArr;
        }

        return digits;
    }
}
