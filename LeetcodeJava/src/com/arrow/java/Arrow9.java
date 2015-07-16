package com.arrow.java;

/**
 * Created by beck on 2015/7/16.
 * Fibonacci
 */
public class Arrow9 {
    //O(n)
    public long fibonacci(int n){
        int fibOne = 0;
        int fibTwo = 1;
        int fibSum = 0;
        for (int i = 2; i <= n; i++){
            fibSum = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = fibSum;
        }
        return fibSum;
    }

    public static void main(String[] args){
        Arrow9 arrow9 = new Arrow9();
        long get = arrow9.fibonacci(8);
        System.out.println(get);
    }
}
