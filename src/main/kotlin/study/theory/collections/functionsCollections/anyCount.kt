package study.theory.collections.functionsCollections

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)

fun main() {
    val data = geraDados()

//    ANY
//    Qualquer coleção pode ser utilizada com essas funções
    println("tenho dados? ${if(data.any()) "sim" else "não"}")
    // Retorna um true ou false dependendo se tem ou não elementos
    // Nesse caso vai retornar true, pois temos vários elementos em "geraDados()"
    println(listOf<Int>().any())

    println("Tenho ${data.count()} elementos.")
}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Macarrão", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 10),
                Ingrediente("Salsa", 10)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

