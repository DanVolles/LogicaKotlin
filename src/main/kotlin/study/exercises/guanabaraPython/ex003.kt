package study.exercises.guanabaraPython

// Create a program that read 2 numbers and show the sum between 'em

fun main() {

    print("Input the first whole number: ")
    val n1 = readln().toInt()
    print("Input the second whole number: ")
    val n2 = readln().toInt()

    val sum = n1 + n2
    println("The sum between $n1 and $n2 is $sum.")
}