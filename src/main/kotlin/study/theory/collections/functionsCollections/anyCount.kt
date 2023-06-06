package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

fun main() {

    val data = geraDados()

    // ANY
    // Qualquer coleção pode ser utilizada com essas funções
    println("tenho dados? ${if(data.any()) "sim" else "não"}")
    // Retorna um true ou false dependendo se tem ou não elementos
    // Nesse caso vai retornar true, pois temos vários elementos em "geraDados()"
    println(listOf<Int>().any())

    // COUNT
    println("Tenho ${data.count()} elementos.")
}