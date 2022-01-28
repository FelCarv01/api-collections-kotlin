package me.felipe.collections

fun main() {
    val values = IntArray(5)
 values[0] = 1
 values[1] = 8
 values[2] = 3
 values[3] = 9
 values[4] = 7
    println("--------------")
    for(valor in values){
        println(valor)
    }
    println("--------------")
    for(index in values.indices){
        println(values[index])
    }
    println("--------------")
    values.forEach {
        println(it)
    }
    println("--------------")
    values.sort()
    for (valor in values){
        println(valor)
    }
}