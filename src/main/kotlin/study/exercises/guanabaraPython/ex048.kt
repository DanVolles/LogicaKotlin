package study.exercises.guanabaraPython

// Calcule a soma de todos os números ímpares de um range inputado pelo usuário

fun sum(min: Int, max: Int) {
    var s = 0
    for (n in min..max){
        if (n % 2 == 0) {
            continue
        } else if (n % 3 != 0){
            continue
        }
        s += n
        println(s)
    }
    println(s)
}

fun main() {

    println("Input the minor value: ")
    val min = readln().toInt()

    println("Input the maximum value: ")
    val max = readln().toInt()

    sum(min, max)

}