package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

fun main() {
    val data = geraDados()
    // Predicate --> é um filtro que vc passa para o kotlin
    data.filter { it.nome == "lasanha" } // Vai retornar uma lista com todas as receitas de nome lasanha
    data.filter { it.calorias > 500 } // Vai retornar uma lista com todas as receitas com mais de 500 kcal
    data.any { it.calorias > 1000 } // O any também aceita o predicado
    data.count { it.calorias > 200 } // Retorna a quantidade de receitas que tem mais de 200 kcal
}