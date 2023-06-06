package study.theory.collections.functionsCollections.dataClasses

import study.theory.collections.functionsCollections.dataClasses.Ingrediente

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
