package com.xueqiya.lib;

public class Leetcode {

    public static void main(String[] args) {
        //两数之和
//        int[] nums = new int[]{2, 7, 11, 15};
//        int target = 9;
//        int[] result = twoSum(nums, target);
//        for (int r : result) {
//            System.out.println(r);
//        }

        //回文数
//        System.out.println(isPalindrome(121));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        String str = String.valueOf(x);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1-i)) {
                return false;
            }
        }
        return true;
    }
}