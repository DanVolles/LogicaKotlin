package study.theory.functions

fun main() {

    val str = "Kotlin programming!"

    println("Tamanho da string: ${str.length}")
    println("Posição 0 da string: ${str[0]}")
    println("Posição 5 da string: ${str[5]}")

    println(str.startsWith("Kotlin", true)) // seleciona se começa com "Kotlin" ignorando o case
    println(str.endsWith("abc"))
    println(str.substring(3, 8))
    println(str.replace("Kotlin", "Java"))

    println(str.lowercase())
    println(str.uppercase())

    println("                Meu nome é:                     ".trim()) // Exclui espaços

}