package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.Receita
import study.theory.collections.functionsCollections.dataClasses.geraDados

// MAP é bem poderosa, por que ela consegue alterar estruturas

fun main() {
    val data = geraDados()

    // O filter aplica um filtro nos elementos
    data.filter { it.calorias > 90 }
    // A saída da função filter é uma lista de receitas (nesse caso), só que menor

    // No caso do MAP, faz uma transformação
    println(data.map { it.nome })
    // vai transformar a receita em alguma outra coisa
    // O que o it vira?? Nesse caso: uma lista de nomes

    // Dá para criar uma nova estrutura:
    println(data.map { Receita(it.nome, it.calorias) })
}