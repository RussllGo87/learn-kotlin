package com.gong.kotlin.chapter04;

/**
 * Created by gong on 2017/7/28.
 */
public class OverloadDemo {

    public static void main(String[] args) {
        Overloads overloads = new Overloads();
        System.out.println(overloads.a(4));

        System.out.println(overloads.a());
    }
}
