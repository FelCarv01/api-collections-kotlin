package me.felipe.collections

fun main() {
    val nomes = Array(3) { "" }
    nomes[0] = "Jose"
    nomes[1] = "Maria"
    nomes[2] = "Doe"


    for (nome in nomes) {
        println(nome)
    }

    println("----------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------")
    val frutas = arrayOf("manga", "uva", "acerola")
    frutas.sort()
    frutas.forEach { println(it) }


}