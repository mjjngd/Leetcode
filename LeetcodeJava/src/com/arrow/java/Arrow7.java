package com.arrow.java;

import java.util.Stack;

/**
 * Created by Estelle on 2015/7/15.
 * ����ջʵ��һ������
 */
public class Arrow7 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();


    //��β��Ԫ��
    public void add(int i){
        stack1.push(i);
    }

    //��ͷȡԪ��
    public int get(){
        while(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
