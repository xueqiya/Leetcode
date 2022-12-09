package com.xueqiya.lib;

public class Leetcode {

    public static void main(String[] args) {
//        int[] array = new int[]{2, 7, 11, 15, 4, 6, 8};
        //两数之和
//        int target = 9;
//        int[] result = twoSum(array, target);
//        for (int r : result) {
//            System.out.println(r);
//        }

        //回文数
//        System.out.println(isPalindrome(121));

        //冒泡排序
//        bubbleSort(array);
//        for (int r : array) {
//            System.out.println(r);
//        }

        //选择排序
//        selectSort(array);

        //插入排序
//        insertSort(array);

        //快速排序
//        quickSort(array, 0, array.length - 1);

        //爬楼梯
        //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
        //每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
        System.out.println(climbStairs(4));

//        for (int r : array) {
//            System.out.println(r);
//        }
    }

    private static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    private static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    private static void quickSort(int[] array, int low, int high) {// 传入low=0，high=array.length-1;
        if (low > high) {
            return;
        }
        int l = low;
        int h = high;
        int base = array[low];
        while (l < h) {
            while (base <= array[h] && l < h) {
                h--;
            }
            while (base >= array[l] && l < h) {
                l++;
            }
            if (l < h) {
                int temp = array[h];
                array[h] = array[l];
                array[l] = temp;
            }
        }
        array[low] = array[l];
        array[l] = base;
        quickSort(array, low, h - 1);
        quickSort(array, h + 1, high);
    }

    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int[] twoSum(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
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
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}