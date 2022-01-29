package me.felipe.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1200.00, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1500.00, tipoContratacao = "CLT")
    val janne = Funcionario(nome = "Janne", salario = 4500.00, tipoContratacao = "PJ")
    val doe = Funcionario(nome = "Doe", salario = 2000.00, tipoContratacao = "CLT")

    println("--------- LIST ---------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.add(janne)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.add( doe)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.remove(doe)
    funcionarios.forEach { println(it) }

    println("--------- SET ---------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.add(doe)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}