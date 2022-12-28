package specificKotlinTypes.operators

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

    /*
    ++a ou a++:
    a ordem de incremento importa:
    no caso do ++a, o incremento ocorre antes da variável
    no caso do a++, o incremento ocorre depois
     */

    // Também podemos colocar assim, como no Java
    numberA += 2
    println(numberA)

}
