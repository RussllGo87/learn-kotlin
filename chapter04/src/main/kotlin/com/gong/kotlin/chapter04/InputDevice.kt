package com.gong.kotlin.chapter04

/**
 * Created by gong on 2017/7/27.
 */
interface InputDevice {
    fun input(event: Any)
}

interface USBInterface: InputDevice

abstract class USBMouse(val name: String): USBInterface {
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return name
    }
}

class LogitechMouse: USBMouse("Super Blue") {
    override fun toString(): String {
        return "Logitech Mouse ".plus(name)
    }
}

interface BLEInterface: InputDevice

class Computer {

    fun addUSBInputDevice(inputDevice: USBInterface) {
        println("add usb input device: $inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInterface) {
        println("add ble input device: $inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        when(inputDevice) {
            is USBInterface -> {
                addUSBInputDevice(inputDevice)
            }
            is BLEInterface -> {
                addBLEInputDevice(inputDevice)
            }
            else -> {
                throw IllegalArgumentException("unsupported device")
            }
        }
    }
}

fun main(args: Array<String>) {
    val computer = Computer()
    val mouse = LogitechMouse()
    computer.addInputDevice(mouse)
}