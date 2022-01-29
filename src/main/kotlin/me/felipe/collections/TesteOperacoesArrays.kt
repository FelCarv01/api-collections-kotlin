package me.felipe.collections

fun main() {
    val salarios = doubleArrayOf(2005.00, 3250.05, 4568.25, 1200.00)

    for (salario in salarios) {
        println(salario)
    }
    println("---------------")
    println("O maior salario é:  ${salarios.maxOf { it }}")
    println("O menor salario é:  ${salarios.minOf { it }}")
    println("A media dos salarios é:  ${salarios.average()}")

    println("---------------")
    val salarioMaior3000 = salarios.filter { it > 3000.00 }
    println(" lista de salarios maior que 3000:\n${salarioMaior3000}")

    println("---------------")
    println(" A QTD de salarios entre 2000 e 5000: \n${ salarios.count { it in 2000.00..5000.00 } }")

    println("---------------")
    println("Encontra salario que seja igual a 2005: \n${ salarios.find { it == 2005.00 } }")
    println("Encontra salario que seja igual a 2005: \n${ salarios.find { it == 2000.00 } }")

    println("---------------")
    println("Retorna verdadeiro se encontrar qualquer valor igual a 2000: \n${ salarios.any { it == 2000.00 } }")
    println("Retorna verdadeiro se encontrar qualquer valor igual a 2005: \n${ salarios.any { it == 2005.00 } }")

}




