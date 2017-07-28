package com.gong.kotlin.chapter04

/**
 * Created by gong on 2017/7/28.
 */
class Driver

open class Player {

    fun previous() {

    }

    fun next() {

    }
}

interface OnExternalDriverMountListener {
    fun onMount(driver: Driver)

    fun onUnMount(driver: Driver)
}

/**
 * object类似于Java中的单例实现
 */
object MusicPlayer: Player(), OnExternalDriverMountListener{

    override fun onMount(driver: Driver) {

    }

    override fun onUnMount(driver: Driver) {

    }

    var state = 1

    fun play(url: String) {

    }

    fun stop() {

    }
}