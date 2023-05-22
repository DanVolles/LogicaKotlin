package study.exercises.guanabaraPython

// Create a game that the PC "thinks" a number and you try to guess which number it was.

fun randomNumber(): Int {
    return (1..3).random()
}

fun main() {
    println("Hello! Let's play a game!\n" +
            "I'll pick a number between 1 and 3\n" +
            "You need to guees which number it was!")

    println(" --- I'm thinking ---")
    val a = randomNumber()

    print("Which number I'm thinking? ")
    val n = readln().toInt()

    if (n == a) {
        println("You are right! I thought the number $a.")
    } else {
        println("You are wrong! I thought the number $a.")
    }

}