package study.theory.lambda

val CONST_1 = hello()
const val CONST_2 = 10 // Precisa ser um valor constante

fun hello () = "olá"

/*
const é uma palavra reservada para ser utilizada em algo chamado top level declaration
algo que não está em classe, está no maior escopo possível
 */

fun main() {
    val a = 1
}