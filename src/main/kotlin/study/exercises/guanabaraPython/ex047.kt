package study.exercises.guanabaraPython

// Mostre na tela todos os números pares entre 0 e 50.

fun main() {

    println("All the even numbers between 0 and 50.")

    for (n in 0..50) {
        if (n % 2 == 0) {
            print("$n ")
        } else {
            continue
        }
    }
}