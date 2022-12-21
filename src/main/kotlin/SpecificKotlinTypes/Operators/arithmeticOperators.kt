package SpecificKotlinTypes

fun main(args: Array<String>) {
    var numberA = 10
    var numberB = 20
    var numberC = 0

    println("--> Number A: $numberA \n--> Number B: $numberB")
    // +
    numberC = numberA + numberB
    println("--- Operator: + ---\n$numberC")

    // -
    numberC = numberA - numberB
    println("--- Operator: - ---\n$numberC")

    // *
    numberC = numberA * numberB
    println("--- Operator: * ---\n$numberC")

    // /
    numberC = numberA / numberB
    println("--- Operator: / ---\n$numberC")

    // ++
    numberC = numberA++
    println("--- Operator: ++ ---\n$numberC")
    numberC = ++numberB
    println("--- Operator: ++ ---\n$numberC")

    // --
    numberC = numberA--
    println("--- Operator: -- ---\n$numberC")
    numberC = --numberB
    println("--- Operator: -- ---\n$numberC")

}
