package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

fun main() {
    val data = geraDados()
    // Take
    val primeiras3 = data.take(3) // O n se refere à quantos elementos da uma determinada lista você gostaria de "pegar"
    // No caso acima, eu quero pegar os 3 primeiros elementos da lista "data"

    val ultimas2 = data.takeLast(2) // Nesse caso eu quero pegar os 2 últimos

    println(primeiras3)
    println(ultimas2)

}