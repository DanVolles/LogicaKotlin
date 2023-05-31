package study.theory.collections

fun main() {

    // O set também é uma collection
    // O set é um conjunto NÃO ORDENADO
    // O set não permite valores duplicados
    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid", "Madrid")
    // ^^ Se você der um println aqui, verá que só vai aparecer 1 "Madrid"
    println(set1)

    // Podemos iniciar um Set vazio // É NECESSÁRIO informar o tipo
    val set = setOf<Boolean>()

    val set2 = mutableSetOf<String>()

    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2. contains("São Paulo") // Não tem indice por que não é ordenado
    set2.clear()
    print(set.size)

}