package com.durga.Topic_Array_String.Find_the_Index_of_the_First_Occurrence_in_a_String;
/*
 * @ Author: Chung Nguyen Thanh <chunhthanhde.dev@gmail.com>
 * @ Created: 2024-05-24 16:20:41
 * @ Message: 🎯 Happy coding and Have a nice day! 🌤️
 */

class Find_the_Index_of_the_First_Occurrence_in_a_String {
    // Method to find the first of the substring "needle" in the string "haystack"
    public int strStr(String hayStack, String needle) {
        // get the length of hayStack and needle
        int hLength = hayStack.length();
        int nLength = needle.length();

        // if needle if an empty String, return 0
        if (nLength == 0) {
            return 0; // empty meedle matches at the start
        }

        // loop through hayStack to find a match for needle,
        // Only loop to hLength - nLength because a substring longer than hayStack's
        // remainder wouldn't match
        for (int i = 0; i <= hLength - nLength; i++) {
            // get the substring from haystack and compare it with needle
            if (hayStack.substring(i, i + nLength).equals(needle)) {
                return i; // if found return the staring index
            }
        }

        // if no match is found, return -1 to indicate needle is not in haystack
        return -1;

    }

}