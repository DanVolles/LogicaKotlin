package study.functions

fun main() {
    sum(10, 15)
    sum2(10, 15)
}

fun sum (a: Int, b: Int): Int {
    return (a + b)
}

fun sum2 (a: Int, b: Int) = (a + b) // Função de uma única linha, pois ela possui apenas UMA instrução
// Ambas as funções realizam a mesma atividade
