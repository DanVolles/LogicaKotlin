package study.theory.collections

// Coleções são conjuntos de elementos
// Coleções são do tipo 'List', 'Set' e 'Map'
// A lista é um conjunto ordenado
fun xpto(vararg a: Int) {
    // Aqui nós teremos um conjunto de elementos do tipo Int
    // Mas não é uma coleção
}

fun main() {
    val abc = "String" // String é uma cadeia de caracteres, mas não é uma coleção

    // List
    val list1 = listOf(1, 2, 3, 4, 5) // Infere que são Ints
    val list2 = listOf(true, false, "abc", 2, 5.0f, "Danilo") // É possível fazer uma lista bem heterogênea
    val list3 = listOf<Int>() // Lista implícita de elementos inteiros
    val list4: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    val list5 = listOf<Boolean>() // Podemos iniciar uma lista vazia

    println(list2[1])
    println(list1.size)

    list4.add(8)
    list4.add(10)
    list4.remove(8)
    list4.removeAt(0)
    println(list4)

    println(list4.contains(1))

    list4.clear()
    println(list4)
}