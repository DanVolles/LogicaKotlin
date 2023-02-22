package study.theory.exceptions

/*
O operador Elvis é um tipo de controle de fluxo que necessita o entendimento de exceptions e Null Safety
verifica o que temos à esquerda e caso seja nulo, executamos o que temos à direita **1
ele substitui o controle de fluxo if determinado abaixo
 */

fun main() {

    val str: String? = null

    if (str == null) {
        println("null")
    } else {
        println(str)
    }

    println(str ?: "null") // **1

}