package me.felipe.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val janne = Funcionario("Janne", 4500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(janne.nome, janne)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("----------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}