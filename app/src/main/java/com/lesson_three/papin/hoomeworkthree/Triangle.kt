package com.lesson_three.papin.hoomeworkthree

import java.lang.Math.sqrt

class Triangle {

    fun getS(a:Double, b:Double, c:Double): Double {
        val p = a+b+c
        return sqrt(p*(p-a)*(p-b)*(p-c))
    }

    fun getP(a:Double, b:Double, c:Double): Double {
        return a+b+c
    }
}