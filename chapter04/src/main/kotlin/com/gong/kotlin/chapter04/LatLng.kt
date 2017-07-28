package com.gong.kotlin.chapter04

import java.math.BigDecimal

/**
 * Created by gong on 2017/7/28.
 */
// 工具相关静态变量与静态函数使用包级变量与包级函数实现
fun main(args: Array<String>) {
    if(args.size > 1) {
        val min = minOf(args[0].toInt(), args[1].toInt())
        println("min == $min")
    }

    val current = LatLng.instance(25.0, 117.6)
    val destination = LatLng.instance(26.25, 120.24)
    val newDes = LatLng.instance()

    println("$destination is on the ${current.direct2(destination)} of $current")


}
class Direction(val lat: Int, val lng: Int ) {
    override fun toString(): String {
    val latStr = when(lat) {
        1 -> "South"
        -1 -> "North"
        else -> {
            ""
        }
    }
    val lngStr = when(lng) {
        1 -> "West"
        -1 -> "East"
        else -> {
            ""
        }
    }
        return latStr + lngStr
    }
}

class LatLng private constructor(private var lat: BigDecimal = 0.0.bd, private var lng: BigDecimal = 0.0.bd){

    companion object{

        @JvmOverloads
        @JvmStatic
        fun instance(lat: Double = 0.0, lng: Double = 0.0): LatLng {
            return LatLng(lat.bd, lng.bd)
        }
    }

    fun ofLat(double: Double): LatLng {
        lat = double.bd
        return this
    }

    fun ofLng(double: Double): LatLng {
        lng = double.bd
        return this
    }

    fun direct2(des: LatLng): Direction {
        val directLat = lat.compareTo(des.lat)
        val directLng = lng.compareTo(des.lng)

        return Direction(directLat, directLng)
    }

    override fun toString(): String {
        return "(${lat.toDouble()} , ${lng.toDouble()})"
    }
}

// Double转成BigDecimal防止计算过程中精度缺失
val Double.bd: BigDecimal
    get() = BigDecimal.valueOf(this)
