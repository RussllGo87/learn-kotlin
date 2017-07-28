package com.gong.kotlin.chapter04;

import java.math.BigDecimal;

/**
 * Created by gong on 2017/7/28.
 */
public class StaticDemo {

    public static void main(String[] args) {
        LatLng current = LatLng.instance(23.0, 112.0);
        System.out.println(current.direct2(LatLng.instance(22.24, 118.6)));

    }
}
