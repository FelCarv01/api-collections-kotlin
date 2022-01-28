package me.felipe.collections

fun main() {
    val values = intArrayOf(2, 5, 10, 4, 8, 1, 9)

    values.forEach {
        println(it)
    }

    println("-------------")
    values.sort()
    values.forEach {
        println(it)
    }
}