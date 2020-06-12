package com.aotter.test.kotlin.native

expect fun platformName(): String


expect fun aotterList(): MutableList<Aotter>


fun createApplicationScreenMessage(): String {
    return platformName()
}


fun getList(): List<Aotter> = aotterList()










