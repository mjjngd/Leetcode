package com.arrow.java;

import java.util.Stack;

/**
 * Created by Estelle on 2015/7/15.
 * 两个栈实现一个队列
 */
public class Arrow7 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();


    //队尾加元素
    public void add(int i){
        stack1.push(i);
    }

    //队头取元素
    public int get(){
        while(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
