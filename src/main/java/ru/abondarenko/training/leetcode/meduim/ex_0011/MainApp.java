package ru.abondarenko.training.leetcode.meduim.ex_0011;

//  https://leetcode.com/problems/container-with-most-water/
//
//  Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
//  Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
//  Notice that you may not slant the container.
//
//  Example 1:
//  Input: height = [1,8,6,2,5,4,8,3,7]
//  Output: 49
//  Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//
//  Example 2:
//  Input: height = [1,1]
//  Output: 1
//
//  Example 3:
//  Input: height = [4,3,2,1,4]
//  Output: 16
//
//  Example 4:
//  Input: height = [1,2,1]
//  Output: 2

public class MainApp {
    public static int maxArea(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int distance = Math.abs(i - j);
                int minHeight = Math.min(height[i], height[j]);
                if (maxArea < distance * minHeight) {
                    maxArea = distance * minHeight;
                }
            }
        }

        return maxArea;
    }

    public static int maxAreaOptimize(int[] height) {
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        int max_area = 0;

        while (a_pointer < b_pointer) {
            if (height[a_pointer] < height[b_pointer]) {
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            } else {
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }

        }
        return max_area;
    }
}
