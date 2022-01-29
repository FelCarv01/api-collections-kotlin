package me.felipe.collections


fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1200.00, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1500.00, tipoContratacao = "CLT")
    val janne = Funcionario(nome = "Janne", salario = 4500.00, tipoContratacao = "PJ")
    val doe = Funcionario(nome = "Doe", salario = 2000.00, tipoContratacao = "CLT")


    val funcionarios = listOf(joao, maria, janne, doe)

    funcionarios.forEach { println(it) }
    println("-------------")
    //usando find para um funcionario
    println(funcionarios.find { it.nome == "Maria" })

    println("-------------")
    funcionarios.sortedBy { it.salario }
        .forEach { println(it) }

    println("-------------")
    funcionarios.groupBy { it.tipoContratacao }
        .forEach { println(it) }

}





