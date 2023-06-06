package study.theory.collections.functionsCollections.dataClasses

import study.theory.collections.functionsCollections.dataClasses.Ingrediente
import study.theory.collections.functionsCollections.dataClasses.Receita

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

