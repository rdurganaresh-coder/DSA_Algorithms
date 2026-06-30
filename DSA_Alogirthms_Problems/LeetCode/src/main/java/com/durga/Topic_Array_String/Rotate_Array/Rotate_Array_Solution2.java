package com.durga.Topic_Array_String.Rotate_Array;
/*
 * @ Author: Chung Nguyen Thanh <chunhthanhde.dev@gmail.com>
 * @ Created: 2024-05-24 16:20:41
 * @ Message: 🎯 Happy coding and Have a nice day! 🌤️
 */

public class Rotate_Array_Solution2 {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n; // Wrap around k if it's greater than n

        int[] temp = new int[k];
        for (int i = 0; i < k; i++){
            temp[i] = nums[nums.length - k + i];
        }

        for (int j = nums.length - 1; j >= k; j--){
            nums[j] = nums[j - k];
        }

        for (int m = 0; m < k; m++){
            nums[m] = temp[m];
        }
    }
}