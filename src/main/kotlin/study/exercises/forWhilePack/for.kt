package study.exercises.forWhilePack

/*
1. Imprima os números de 1 a 50 na mesma linha em ordem crescente.
2. Imprima os números de 1 a 50 na mesma linha em ordem decrescente.
3. Não imprima os múltiplos de 5.
4. Some todos os números no intervalo entre 1 e 500.
5. Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N
            #
            ##
            ###
            ####
            #####
            ######
            ####### N = 7
 */

fun main() {

    println("--- ex 1 ---")
    ascendingOrder(1, 50)

    println("--- ex 2 ---")
    descendingOrder(50, 1)

    println("--- ex 3 ---")
    ascendingOrderNo5Multiples(1, 20)

    println("--- ex 4 ---")
    sum(1, 500)

    println("--- ex 5 ---")
    ladder(10)

}

fun ascendingOrder(a: Int, z: Int) {
    for (i in a until z + 1) {
        print("$i, ")
    }
    println("\n")
}

fun descendingOrder(a: Int, z: Int) {
    for (i in a downTo z) {
        print("$i, ")
    }
    println("\n")
}

fun ascendingOrderNo5Multiples(a: Int, z: Int) {
    for (i in a until z + 1) {

        if (i % 5 == 0) {
            continue
        }

        print("$i, ")
    }
    println("\n")
}

fun sum(a: Int, z: Int) {

    var soma = 0
    for (i in a until z) {
        soma += i
    }
    println("$soma\n")
}

fun ladder(n:Int) {

    for (i in 1..n ) {
        for (j in 1..i){
            print("#")
        }
        println()
    }
}