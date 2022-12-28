package exercises

import kotlin.math.*

fun main() {

    /* 1. Escrever uma função capaz de receber a quantidade de anos e
     *    transformar em meses, dias, horas, minutos e segundos
     */
    tempo(5)

    // 2. Receber string e retornar qtd de caracteres
    println(qtdCaracteres("Danilo"))

    // 3. Calcular o cubo de um numero
    println(cubo(20))

    // 4. Converter milhas em KM
    println(miToKm(300))

    // 5. Trocar letras 'a' por 'x'
    println(trocarLetras("PIRACICABANA"))


}

fun trocarLetras(palavra: String): String {
    return palavra.replace("a", "x", true).lowercase()
}

fun miToKm(miles: Int) = miles * 1.6093

fun cubo (x: Int) = x*x*x

fun qtdCaracteres(s: String): Int = s.length

fun tempo (anos: Int) {

    var meses = anos * 12
    var dias = anos * 365
    var horas = anos * 365 * 24
    var minutos = anos * 365 * 24 * 60
    var segundos = anos * 365 * 24 * 60 * 60

    println("$anos anos equivalem a: \n" +
            "$meses meses,\n" +
            "$dias dias,\n" +
            "$horas horas,\n" +
            "$minutos minutos e \n" +
            "$segundos segundos.")
}
