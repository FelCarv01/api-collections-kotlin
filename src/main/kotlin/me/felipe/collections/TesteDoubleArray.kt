package me.felipe.collections

fun main() {
    val cordenadasXYZ = doubleArrayOf(254.25, 451.58, 25.36)
    println("coordenadas XYZ")
    cordenadasXYZ.forEach {

        println(it)
    }
    println("-------------")
    println("coordenadas a ampliadas em 10%")
    cordenadasXYZ.forEachIndexed { idx, cordenada ->
        cordenadasXYZ[idx] = cordenada * 1.1

    }
    cordenadasXYZ.forEach { println(it) }
}