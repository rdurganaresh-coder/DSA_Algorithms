package com.durga.Topic_Array_String.Remove_Duplicates_from_Sorted_Array;/*
 * @ Author: Chung Nguyen Thanh <chunhthanhde.dev@gmail.com>
 * @ Created: 2024-09-11 12:41:06
 * @ Message: 🎯 Happy coding and Have a nice day! 🌤️
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k++] = x;
            }
        }
        return k;
    }
}