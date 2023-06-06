package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

fun main() {
    val data = geraDados()
    data.forEach { println(it.nome) } // Para cada item ele faz o que está entre as chaves.
    // Nesse caso, para cada receita em data, ele vai printar o nome.
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }
    // Nesse caso para cada receita acima de 500 calorias ele vai printar o nome.
}