
package com.aotter.test.kotlin.native


import platform.UIKit.UIDevice

actual fun platformName(): String {

    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion
}

actual fun aotterList():MutableList<Aotter>{

    val list = mutableListOf<Aotter>()

    for (i in 0 until 15){

        list.add(i,Aotter("我是Title $i","我是Content $i"))

    }

    return list
}