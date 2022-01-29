package me.felipe.collections



fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "5400".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("------------")
    println(salarios.somatoria())

    println("------------")
    println(salarios.media())
}