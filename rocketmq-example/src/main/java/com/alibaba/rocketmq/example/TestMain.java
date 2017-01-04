package com.alibaba.rocketmq.example;

/**
 * @author laochunyu
 * @version 1.0
 * @date 2016/12/29
 */
public class TestMain {

    public static void main(String[] args) {
        System.out.println(String.class.getCanonicalName());
        System.out.println(Integer.class.getCanonicalName());
        System.out.println(TestMain.class.getCanonicalName());
        System.out.println(TestMain.class.getSimpleName());
        System.out.println(TestMain.class.getName());
    }
}
