package study.exercises.ifElsePack

/*
Escreva um programa para ser usado na portaria de um evento
    a. peça a idade, menores não são permitidos.
    b. peça o tipo de convite (comum, premium, luxo). Negar a entrada caso não seja nenhum desses
    c. peça o código do convite. Premium e luxo começam com XL, comuns começam com XT.
    d. Caso todos os critérios sejam satisfeitos, exibir welcome.

ENGLISH
    The ticket must start with XL if they are Premium and Luxury
    The ticket must start with XT if they are Standart
 */

fun main() {

    println("Please, identify yourself to entry the event.")

    println("Please, enter your age:")
    val age = readln().toInt()

    println("Please, enter the ticket code:")
    val ticket = readln()

    if (age < 18) {

        println("You must have +18 years to enter the event.")

    } else {

        if (ticket.startsWith("XL", true)){
            println("You have a Premium ticket! Be Welcome!")
        } else if (ticket.startsWith("XT", true)){
            println("You have a Standard ticket! Be Welcome!")
        } else {
            println("Invalid ticket")
        }
    }
}