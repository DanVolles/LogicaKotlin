package study.theory.collections.functionsCollections

import study.theory.collections.functionsCollections.dataClasses.geraDados

fun main() {
    val data = geraDados()

    // SUM & SUMOF
    // Esses aqui só retornam tipos numéricos, então precisamos de dados numéricos
    listOf<Float>(1.3f, 2.4f, 5.9f, 2.0f, 123.45f).sum()
    listOf(1, 2, 3, 4, 5, 6).sum() // Podemos omitir o tipo das variáveis nos <> se for explícito

    // sumOf
    println(data.sumOf { it.calorias }) // Ele vai te dar a soma de todas as calorias de todas as receitas em "data"
    // Bem bacana essa funcionalidade, eu não preciso alterar muita coisa pra ter uma soma específica de um "argumento" específico
}