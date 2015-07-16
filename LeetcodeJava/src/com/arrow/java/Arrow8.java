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
            }else if (array[middle] == array[low] && array[middle] == array[high]){//如果三个数字相等的话就顺序查找
                return getTheSmallestOneInOrder(array, low, high);
            }else {// if (array[middle] == array[low])
                return array[middle];
            }
        }
        return array[middle + 1];
    }

    //顺序查找
    public int getTheSmallestOneInOrder(int[] array, int low, int high){
        int temp = array[low];
        for (int i = low; i < high; i++){
            if(array[i] < temp){
                temp = array[i];
            }
        }
        return temp;
    }

    public static void main(String[] args){
        int[] array = {1,0,1,1,1};
        Arrow8 arrow8 = new Arrow8();
        int get = arrow8.getTheSmallestOne(array, 0, 4);
        System.out.println(get);
    }

}
