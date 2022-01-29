package me.felipe.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome,
            Salario: $salario,
            TipoContrato: $tipoContratacao
        """.trimIndent()
}
