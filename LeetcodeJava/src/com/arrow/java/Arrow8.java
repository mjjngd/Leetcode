package com.arrow.java;

/**
 * Created by beck on 2015/7/16.
 * 求旋转数组的最小元素
 */
public class Arrow8 {
    public int getTheSmallestOne(int[] array, int low, int high){
        int middle = (low + high) / 2;
        if (low < high){
            if (array[middle] > array[low]){
                getTheSmallestOne(array, middle + 1, high);
            }else if (array[middle] < array[low]){
                getTheSmallestOne(array, low, middle - 1);
            }else {// if (array[middle] == array[low])
                return array[middle];
            }
        }
        return array[middle + 1];
    }

    public static void main(String[] args){
        int[] array = {3,4,5,1,2};
        Arrow8 arrow8 = new Arrow8();
        int get = arrow8.getTheSmallestOne(array, 0, 4);
        System.out.println(get);
    }

}
