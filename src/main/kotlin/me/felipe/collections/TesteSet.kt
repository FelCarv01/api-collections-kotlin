package me.felipe.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1200.00, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1500.00, tipoContratacao = "CLT")
    val janne = Funcionario(nome = "Janne", salario = 4500.00, tipoContratacao = "PJ")
    val doe = Funcionario(nome = "Doe", salario = 2000.00, tipoContratacao = "CLT")


    val funcionariosPj = setOf(janne)
    val funcionariosClt = setOf(joao, maria, doe)


    val resultUnion = funcionariosPj.union(funcionariosClt)

    resultUnion.forEach { println(it) }

    println("-----------")
    val todosFuncionarios = setOf(joao, maria, doe, janne)
    val resultSubtracao = todosFuncionarios.subtract(funcionariosPj)
    resultSubtracao.forEach { println(it)  }

    println("-----------")
    val resultIntercecao = todosFuncionarios.intersect(funcionariosPj)
    resultIntercecao.forEach { println(it)  }



}