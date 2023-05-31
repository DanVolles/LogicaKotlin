package study.theory.collections

fun main() {

    // O Map é um conjunto do tipo 'CHAVE -> VALOR'
    // A chave é única
    // Para cada item você tem uma dupla dessas

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Japão", "Toquio"))
    // ^^ Map só aceita um item, um par de "chave/valor" --> Você sobrescreve se colocar mais de um.
    val map2 = mapOf<String, Int>()
    val map3 = mutableMapOf<String, String>(Pair("Alemanha", "Berlim"))

    println(map1)
    println(map1.entries)
    println(map1.values)

    map3["Brasil"] = "Brasilia"

    println(map3)

    map3.remove("Brasil")
    map3.contains("Brasil")
    map3.clear()
}